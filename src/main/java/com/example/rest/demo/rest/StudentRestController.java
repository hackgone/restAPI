package com.example.rest.demo.rest;

import com.example.rest.demo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.plaf.synth.SynthButtonUI;
import java.util.*;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    //define endpoint for /students return list of students
    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> theStudent = new ArrayList<>();
        theStudent.add(new Student("Piyush","Bist"));
        theStudent.add(new Student("Piyush",""));
        theStudent.add(new Student("Piyush","hell"));
        return theStudent;
    }
}
