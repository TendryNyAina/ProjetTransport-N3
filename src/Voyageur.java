import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Voyageur extends Utilisateur {
    private String telephone;
    private int nombreDeBagage;

    public Voyageur(int id, String nom, String prenom, String email, String telephone, int nombreDeBagage) {
        super(id, nom, prenom, email);
        this.telephone = telephone;
        this.nombreDeBagage = nombreDeBagage;
    }
}