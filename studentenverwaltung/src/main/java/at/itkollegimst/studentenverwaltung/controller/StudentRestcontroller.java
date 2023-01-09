package at.itkollegimst.studentenverwaltung.controller;

import at.itkollegimst.studentenverwaltung.domain.Student;
import at.itkollegimst.studentenverwaltung.exceptions.StudentNichtGefunden;
import at.itkollegimst.studentenverwaltung.services.StudentenService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/studenten")
public class StudentRestcontroller {
    private StudentenService studentenService;

    public StudentRestcontroller(StudentenService studentenService) {
        this.studentenService = studentenService;
    }

    @GetMapping
    public ResponseEntity<List<Student>> gibAlleStudenten(){
        return ResponseEntity.ok(this.studentenService.alleStudenten());
    }

    @PostMapping
    public ResponseEntity <Student> studentEinfuegen(@RequestBody Student student){
        return ResponseEntity.ok(this.studentenService.studentEinfuegen(student));
    }

    @DeleteMapping("/{id}")
    public String studentenLoeschen(@PathVariable Long id){
        this.studentenService.studentLoeschenMitId(id);
        return "Student gelöscht";
    }

    @GetMapping("/mitplz/{plz}")
    public ResponseEntity <List<Student>> alleStudentenMitPlz(@PathVariable String plz){

        return ResponseEntity.ok(this.studentenService.alleStudentenMitPlz(plz));
    }

    @GetMapping("/{id}")
    public ResponseEntity <Student> studentMitId(@PathVariable Long id) throws StudentNichtGefunden {

        return ResponseEntity.ok(this.studentenService.studentMitId(id));
    }
}
