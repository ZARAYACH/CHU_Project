package module.designpatterns.chuprojet.sections;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import module.designpatterns.chuprojet.Person.Medecin;
import module.designpatterns.chuprojet.Person.Patient;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Section {
    @Id
    private Long id;

    @OneToMany(mappedBy = "section")
    private List<Medecin> medecins;

    @OneToMany(mappedBy = "section")
    private List<Patient> patients;
}
