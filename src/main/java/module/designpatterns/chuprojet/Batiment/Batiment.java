package module.designpatterns.chuprojet.Batiment;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import module.designpatterns.chuprojet.Person.modal.Personnel;

import java.util.Collection;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Batiment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String emplacement;
    private Long taille;
    private String fonctionnalite;
    private String description;

    public Batiment(Long id, String emplacement, Long taille, String fonctionnalite, String description) {
        this.id = id;
        this.emplacement = emplacement;
        this.taille = taille;
        this.fonctionnalite = fonctionnalite;
        this.description = description;
    }

    @OneToMany(mappedBy = "batiment")
    private Collection<Personnel> personnel;


    @Getter
    @AllArgsConstructor
    public enum category {
        ADMINISTRATION(Administration.class),
        CHIRUGIE(Chirurgie.class),
        LABORATOIRES(Laboratoires.class),
        MEDECINE_GENERALE(MedecineGenerale.class),
        RADIOLOGIE(Radiologie.class),
        SPECIALIRES_MEDICALES(SpecialitesMedicales.class),
        URGENCE(Urgence.class);

        private final Class<? extends Batiment> aClass;

    }

}
