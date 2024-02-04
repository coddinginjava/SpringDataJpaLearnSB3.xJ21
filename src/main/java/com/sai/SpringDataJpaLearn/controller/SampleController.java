package com.sai.SpringDataJpaLearn.controller;

import com.sai.SpringDataJpaLearn.entity.onetoone.Certification;
import com.sai.SpringDataJpaLearn.entity.onetoone.Student;
import com.sai.SpringDataJpaLearn.service.SampleService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class SampleController {

    private final SampleService service;

    @PostMapping("/1to1/saveStudent")
    public ResponseEntity<?> saveStudent(@RequestBody Student student) {
        try {
            Student s = service.saveStudent1to1(student);
            return ResponseEntity.ok(student);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping("/1to1/getStudent/{id}")
    public ResponseEntity<?> getStudent(@PathVariable("id") Integer id ){
        Student s = service.getStudentById(id);
        if(s!=null)
            return ResponseEntity.ok(s);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/1to1/getCert/{id}")
    public ResponseEntity<?> getCert(@PathVariable("id") Integer id ){
        Certification s = service.getCertById(id);
        if(s!=null)
            return ResponseEntity.ok(s);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
