package at.itkollegimst.studentenverwaltung.repositories;

import at.itkollegimst.studentenverwaltung.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository  /* muss nicht angegeben werden, da JpaRepository dies schon beinhaltet */
public interface StudentJPARepo extends JpaRepository<Student,Long> {        /* Erbt vom Standard JPARepo welches einen Generic und den Typ des Schlüßels verlangt*/

    List<Student> findAllByPlz(String plz);
}
