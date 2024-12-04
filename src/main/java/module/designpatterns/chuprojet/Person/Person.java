package module.designpatterns.chuprojet.Person;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Person {
    @Id
    private Long id;
    private String nom;
    private String prenom;
    private String fonction;
    private LocalDateTime birthDate;

    public Person(Long id, String nom, String prenom, String fonction, LocalDateTime birthDate) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.fonction = fonction;
        this.birthDate = birthDate;
    }
}
