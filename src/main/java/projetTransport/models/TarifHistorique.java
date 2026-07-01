package projetTransport.models;



import projetTransport.enums.Saison;
import projetTransport.enums.TypeVehicule;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TarifHistorique {
    private Trajet trajet;
    private TypeVehicule typeVehicule;
    private int annee;
    private Saison saison;
    private double prixUnitaireAriary;
}
