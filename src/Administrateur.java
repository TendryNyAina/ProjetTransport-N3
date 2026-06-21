import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Administrateur extends Utilisateur {
    private RoleAdmin role;

    public Administrateur(int id, String nom, String prenom, String email, RoleAdmin role) {
        super(id, nom, prenom, email);
        this.role = role;
    }
}