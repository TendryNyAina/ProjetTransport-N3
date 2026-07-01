package projetTransport.models;



import projetTransport.enums.TypeVehicule;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Vehicule {
    private int id;
    private String immatriculation;
    private TypeVehicule typeVehicule;
}
