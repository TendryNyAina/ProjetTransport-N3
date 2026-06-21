import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class Reservation {
    private int id;
    private Voyageur voyageur;
    private Voyage voyage;
    private LocalDateTime dateReservation;
    private double montantPaye;
    private MethodePaiement methodePaiement;
    private boolean estPayee;
}