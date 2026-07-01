package projetTransport;


import projetTransport.config.DatabaseConfig;


import projetTransport.config.DatabaseConfig;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuer = true;

        System.out.println("==================================================");
        System.out.println("   SYSTÈME DE NAVIGATION COOPÉRATIVE (POSTGRES)");
        System.out.println("==================================================\n");

        while (continuer) {
            System.out.println("----- MENU OPÉRATEUR -----");
            System.out.println("1 - Pour voir les voitures (Types de Véhicules)");
            System.out.println("2 - Pour voir les voyages (Trajets Provinces)");
            System.out.println("3 - Pour quitter");
            System.out.print("Votre choix : ");

            String choix = scanner.nextLine();

            switch (choix) {
                case "1":
                    afficherVoitures();
                    break;
                case "2":
                    afficherVoyages();
                    break;
                case "3":
                    System.out.println("\nFermeture de l'application. Veloma !");
                    continuer = false;
                    break;
                default:
                    System.out.println("\n[ATTENTION] Choix invalide, veuillez recommencer.\n");
            }
        }
        scanner.close();
    }

    private static void afficherVoitures() {
        String query = "SELECT * FROM vehicule";
        System.out.println("\n--- LISTE DES VOITURES DISPONIBLES ---");

        try (Connection conn = DatabaseConfig.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            System.out.printf("%-5s | %-12s | %-15s | %-10s\n", "ID", "IMMATRICUL.", "TYPE", "CAPACITÉ");
            System.out.println("---------------------------------------------------------");

            while (rs.next()) {
                int id = rs.getInt("id");
                String immatriculation = rs.getString("immatriculation");
                String type = rs.getString("type_vehicule");
                int capacite = rs.getInt("capacite");

                System.out.printf("%-5d | %-12s | %-15s | %-10d places\n", id, immatriculation, type, capacite);
            }
            System.out.println();

        } catch (SQLException e) {
            System.err.println("Erreur de connexion ou SQL : " + e.getMessage());
        }
    }

    private static void afficherVoyages() {
        String query = "SELECT v.id, v.nom_ligne, v.axe_routier, v.date_depart, v.prix_unitaire_ariary, veh.type_vehicule " +
                "FROM voyage v " +
                "LEFT JOIN vehicule veh ON v.vehicule_id = veh.id";

        System.out.println("\n--- LISTE DES VOYAGES ET TRAJETS PROVINCES ---");

        try (Connection conn = DatabaseConfig.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            System.out.printf("%-5s | %-30s | %-6s | %-20s | %-12s | %-15s\n",
                    "ID", "TRAJET / LIGNE", "AXE", "DATE DÉPART", "TARIF (Ar)", "VÉHICULE");
            System.out.println("------------------------------------------------------------------------------------------------------");

            while (rs.next()) {
                int id = rs.getInt("id");
                String ligne = rs.getString("nom_ligne");
                String axe = rs.getString("axe_routier");
                String date = rs.getTimestamp("date_depart").toString();
                double prix = rs.getDouble("prix_unitaire_ariary");
                String vehiculeType = rs.getString("type_vehicule");

                System.out.printf("%-5d | %-30s | %-6s | %-20s | %-12.2f | %-15s\n",
                        id, ligne, axe, date, prix, (vehiculeType != null ? vehiculeType : "Aucun"));
            }
            System.out.println();

        } catch (SQLException e) {
            System.err.println("Erreur de connexion ou SQL : " + e.getMessage());
        }
    }
}