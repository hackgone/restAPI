package com.example.rest.demo.rest;

import com.example.rest.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.plaf.synth.SynthButtonUI;
import java.util.*;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private List<Student> theStudent;

    //postconstruct will be called once after bean is loaded
    @PostConstruct
    public void loadData(){
        theStudent = new ArrayList<>();
        theStudent.add(new Student("Piyush","Bist"));
        theStudent.add(new Student("Piyush",""));
        theStudent.add(new Student("Piyush","hell"));
    }
    //define endpoint for /students return list of students
    @GetMapping("/students")
    public List<Student> getStudents(){
        return theStudent;
    }
}
