package projetTransport.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Utilisateur {
    private int id;
    private String nom;
    private String prenom;
    private String email;
}

