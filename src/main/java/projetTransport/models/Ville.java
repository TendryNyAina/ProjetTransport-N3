package projetTransport.models;


import projetTransport.enums.Province;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Ville {
    private int id;
    private String nom;
    private Province province;
}
