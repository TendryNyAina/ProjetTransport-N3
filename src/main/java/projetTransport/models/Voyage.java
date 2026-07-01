package projetTransport.models;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Voyage {
    private int id;
    private Trajet trajet;
    private Vehicule vehicule;
    private LocalDateTime dateHeureDepart;
    private List<Place> places;

    public Voyage(int id, Trajet trajet, Vehicule vehicule, LocalDateTime dateHeureDepart) {
        this.id = id;
        this.trajet = trajet;
        this.vehicule = vehicule;
        this.dateHeureDepart = dateHeureDepart;
        this.places = new ArrayList<>();

        int capacite = vehicule.getTypeVehicule().getCapacite();
        for (int i = 1; i <= capacite; i++) {
            this.places.add(new Place(i, true));
        }
    }

    public List<Integer> getNumerosPlacesLibres() {
        List<Integer> libres = new ArrayList<>();
        for (Place p : places) {
            if (p.isDisponible()) libres.add(p.getNumero());
        }
        return libres;
    }

    public boolean reserverSieges(List<Integer> numerosDemandes) {
        for (Integer num : numerosDemandes) {
            if (!places.get(num - 1).isDisponible()) return false;
        }
        for (Integer num : numerosDemandes) {
            places.get(num - 1).setDisponible(false);
        }
        return true;
    }
}
