package com.sai.SpringDataJpaLearn.controller;

import com.sai.SpringDataJpaLearn.entity.ManytoMany.Employee;
import com.sai.SpringDataJpaLearn.entity.ManytoMany.Project;
import com.sai.SpringDataJpaLearn.service.SampleService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/manytomany")
public class ManytoManyController {

    private final SampleService service;

    @PostMapping("/saveEmployee")
    public Employee saveEmployee(@RequestBody Employee employee){
        return service.saveEmployee(employee);
    }

    @PostMapping("/saveProject")
    public Project saveEmployee(@RequestBody Project project){
        return service.saveProject(project);
    }

    @GetMapping(value = {"/emp","/{id}"})
    public ResponseEntity<?> getEmployee(@PathVariable(required = false,value = "id") Long id ){
        return service.getEmployee(id);
    }

    @PutMapping("/emp/{empId}/proj/{projId}")
    public Employee assignEmployee(@PathVariable("empId")Long empId, @PathVariable("projId") Long projId){
        return service.assignEmpProj(empId,projId);
    }
}
