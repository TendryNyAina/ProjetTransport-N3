import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
public enum TypeVehicule {
    MERCEDES_BENZ(9, 200),
    VOLKSWAGEN(7, 260),
    SPRINTER(32, 160),
    RENAULT(9, 240),
    AUDI(7, 300),
    FORD(7, 280),
    TOYOTA(9, 200);

    private int nombreDePlace;
    private int vitesseKmh;
}
