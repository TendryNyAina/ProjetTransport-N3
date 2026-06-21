import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public abstract class Utilisateur {
    private int id;
    private String nom;
    private String prenom;
    private String email;
}