package module.designpatterns.chuprojet.Person.modal;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import module.designpatterns.chuprojet.Batiment.modal.Batiment;
import module.designpatterns.chuprojet.sections.Section;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Medecin extends Personnel {

    public Medecin(Long id, String nom, String prenom, String fonction, LocalDateTime birthDate, String personnelId, Batiment batiment, Section section) {
        super(id, nom, prenom, fonction, birthDate, personnelId, batiment);
        this.section = section;
    }
    @ManyToOne(cascade = CascadeType.ALL)
    private Section section;

}
