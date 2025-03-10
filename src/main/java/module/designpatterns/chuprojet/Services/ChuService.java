package module.designpatterns.chuprojet.Services;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "chu_service")
public abstract class ChuService implements Service , Observateur{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

}
