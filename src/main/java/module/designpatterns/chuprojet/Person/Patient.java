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
public class Patient extends Person {

    private String type; //Could be an enum if you already have the types

    public Patient(Long id, String nom, String prenom, String fonction, LocalDateTime birthDate, String type) {
        super(id, nom, prenom, fonction, birthDate);
        this.type = type;
    }
    @ManyToOne(cascade = CascadeType.ALL)
    private Section section;


}
