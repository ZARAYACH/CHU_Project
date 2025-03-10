package module.designpatterns.chuprojet.services.modal;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import module.designpatterns.chuprojet.services.obsarvable.Observateur;
import module.designpatterns.chuprojet.services.composite.Service;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "chu_service")
public abstract class ChuService implements Service, Observateur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

}
