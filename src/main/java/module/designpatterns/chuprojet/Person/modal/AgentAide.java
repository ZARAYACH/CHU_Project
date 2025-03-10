package module.designpatterns.chuprojet.Person.modal;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import module.designpatterns.chuprojet.Batiment.modal.Batiment;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class AgentAide extends Personnel {

    public AgentAide(Long id, String nom, String prenom, String fonction, LocalDateTime birthDate, String personnelId, Batiment batiment) {
        super(id, nom, prenom, fonction, birthDate, personnelId, batiment);
    }
}
