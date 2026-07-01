package projetTransport.models;


import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Compagnie {
    private String nomCompagnie;
    private Administrateur administrateur;
    private List<Voyage> listeVoyages;
    private List<Reservation> listeReservations;
}