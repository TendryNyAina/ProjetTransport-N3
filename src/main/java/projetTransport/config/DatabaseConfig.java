package projetTransport.config;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {
    // Remplacer "cooperative_db", "cotisse_user" et le mot de passe par vos valeurs
    private static final String URL = "jdbc:postgresql://localhost:5432/cooperative_db";
    private static final String USER = "cotisse_user";
    private static final String PASSWORD = "mon_mot_de_passe_secret";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Driver PostgreSQL introuvable ! " + e.getMessage());
        }
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}