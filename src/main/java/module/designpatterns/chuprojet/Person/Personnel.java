package module.designpatterns.chuprojet.Person;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@NoArgsConstructor
public class Personnel extends Person {

    @Column(unique = true, nullable = false)
    private String PersonnelId;

    public Personnel(Long id, String nom, String prenom, String fonction, LocalDateTime birthDate, String personnelId) {
      super(id, nom, prenom, fonction, birthDate);
        PersonnelId = personnelId;
    }

}
