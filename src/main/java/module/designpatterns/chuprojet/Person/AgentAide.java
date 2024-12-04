package module.designpatterns.chuprojet.Person;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class AgentAide extends Personnel {

    public AgentAide(Long id, String nom, String prenom, String fonction, LocalDateTime birthDate, String personnelId) {
        super(id, nom, prenom, fonction, birthDate, personnelId);
    }
}
