import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Voyage {
    private int id;
    private Trajet trajet;
    private Vehicule vehicule;
    private LocalDateTime dateHeureDepart;
    private int placesDisponibles;

}