package module.designpatterns.chuprojet.sections;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import module.designpatterns.chuprojet.Person.modal.Medecin;
import module.designpatterns.chuprojet.Person.modal.Patient;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "chu_section")
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "section")
    private List<Medecin> medecins;

    @OneToMany(mappedBy = "section")
    private List<Patient> patients;
}
