package projetTransport.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TypeVehicule {
    MERCEDES_BENZ(9, 200), // Souvent utilisé pour le VIP (Crafter/Sprinter VIP)
    VOLKSWAGEN(7, 260),
    SPRINTER(32, 160),     // Taxi-brousse standard (Sprinter rallongé)
    RENAULT(9, 240),
    AUDI(7, 300),
    FORD(7, 280),
    TOYOTA(18, 200);       // Mazda / Toyota Hiace

    private final int capacite;
    private final int vitesseMax;
}
