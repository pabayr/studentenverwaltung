package at.itkollegimst.studentenverwaltung.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

/* Diese LombokAnnotationen dienen Lombok dazu, dass JPA die jeweiligen Datenmodelle erstellen kann.
   In der Praxis würden die obenstehenden Annotationen hier nicht so gesetzt werden, da dies meist in Konflikt zur
   Businesslogik steht.
 */
public class Student {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)  /* Art und Weise wie der Primärschlüßel generiert wird */
    private Long id;

    @Size(min=2)    /* jakarta validation*/
    private String name;

    @Size(min=4,max=6)
    private String plz;

    public Student(String name,String plz){

        this.name=name;
        this.plz=plz;
    }
}
