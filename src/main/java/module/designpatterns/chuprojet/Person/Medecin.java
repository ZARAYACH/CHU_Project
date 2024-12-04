package module.designpatterns.chuprojet.Person;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import module.designpatterns.chuprojet.sections.Section;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Medecin extends Personnel {

    public Medecin(Long id, String nom, String prenom, String fonction, LocalDateTime birthDate, String personnelId) {
        super(id, nom, prenom, fonction, birthDate, personnelId);
    }
    @ManyToOne(cascade = CascadeType.ALL)
    private Section section;

}
