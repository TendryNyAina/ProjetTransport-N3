import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Compagnie {
    private String nomCompagnie;
    private Administrateur administrateur;
    private List<Voyage> listeVoyages;
    private List<Reservation> listeReservations;
}