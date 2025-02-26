package module.designpatterns.chuprojet.Batiment;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Batiment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String emplacement;
    private Long taille;
    private String fonctionnalite;
    private String description;

}
