package projetTransport.models;

import projetTransport.enums.MethodePaiement;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Reservation {
    private int id;
    private Voyageur voyageur;
    private Voyage voyage;
    private LocalDateTime dateReservation;
    private List<Integer> numerosPlaces;
    private double montantTotalRequis;
    private double montantPaye;
    private MethodePaiement methodePaiement;
    private boolean estPayee;

    public Reservation(int id, Voyageur voyageur, Voyage voyage, List<Integer> numerosPlaces, double prixUnitaireHistorise) {
        this.id = id;
        this.voyageur = voyageur;
        this.voyage = voyage;
        this.numerosPlaces = numerosPlaces;
        this.dateReservation = LocalDateTime.now();
        this.montantTotalRequis = prixUnitaireHistorise * numerosPlaces.size();
        this.montantPaye = 0.0;
        this.estPayee = false;
    }

    public void effectuerPaiement(double montant, MethodePaiement methode) {
        this.montantPaye += montant;
        this.methodePaiement = methode;

        System.out.println("Paiement reçu : " + montant + " Ar via " + methode + ". Total payé : " + this.montantPaye + " / " + this.montantTotalRequis);

        if (this.montantPaye >= this.montantTotalRequis) {
            this.estPayee = true;
            System.out.println("-> Réservation payée en totalité !");
        } else {
            System.out.println("-> Il reste à payer : " + getResteAPayer() + " Ar.");
        }
    }

    public double getResteAPayer() {
        return this.montantTotalRequis - this.montantPaye;
    }
}
