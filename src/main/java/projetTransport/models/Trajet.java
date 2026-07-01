package projetTransport.models;


import projetTransport.enums.AxeRoutier;
import projetTransport.enums.TypeDistance;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Trajet {
    private String nomLigne;
    private AxeRoutier axe;
    private Ville villeDepart;
    private Ville villeArrivee;
    private double distanceKm;
    private TypeDistance typeDistance;
}
