import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Trajet {
    private Ville villeDepart;
    private Ville villeArrivee;
    private double distanceKm;
    private TypeDistance typeDistance;
}
