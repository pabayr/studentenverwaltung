package at.itkollegimst.studentenverwaltung.services;

import at.itkollegimst.studentenverwaltung.domain.Student;
import at.itkollegimst.studentenverwaltung.exceptions.StudentNichtGefunden;

import java.util.List;

public interface StudentenService {    /* Servicelayer hauptsächlich für die Businesslogik zuständig, in unserem Beispiel ist CRUD jedoch ausreichend*/
List<Student> alleStudenten();
Student studentEinfuegen(Student student);
Student studentMitId(Long id) throws StudentNichtGefunden;
List<Student> alleStudentenMitPlz(String plz);
void studentLoeschenMitId(Long id);


}
