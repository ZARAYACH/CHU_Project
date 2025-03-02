package module.designpatterns.chuprojet.Person;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import module.designpatterns.chuprojet.Batiment.Batiment;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public abstract class Personnel extends Person {

    @Column(unique = true, nullable = false)
    private String PersonnelId;

    @ManyToOne
    @JoinColumn(name = "batiment_id")
    private Batiment batiment;


    public Personnel(Long id, String nom, String prenom, String fonction, LocalDateTime birthDate, String PersonnelId, Batiment batiment) {
        super(id, nom, prenom, fonction, birthDate);
        this.PersonnelId = PersonnelId;
        this.batiment = batiment;
    }
}
