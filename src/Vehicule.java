import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Vehicule {
    private int id;
    private String immatriculation;
    private TypeVehicule typeVehicule;
}