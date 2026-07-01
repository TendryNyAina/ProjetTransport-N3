package projetTransport.models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Voyageur extends Utilisateur {
    private String telephone;
    private int age;
    private String numeroCIN;

    public Voyageur(int id, String nom, String prenom, String email, String telephone, int age, String numeroCIN) {
        super(id, nom, prenom, email);
        this.telephone = telephone;
        this.age = age;

        // Règle de gestion malgache : CIN obligatoire si >= 18 ans
        if (age >= 18 && (numeroCIN == null || numeroCIN.trim().isEmpty())) {
            throw new IllegalArgumentException("Refusé : Le numéro de CIN est obligatoire pour les voyageurs majeurs (18 ans et plus).");
        }

        this.numeroCIN = numeroCIN;
    }
}