package com.sai.SpringDataJpaLearn.service;

import com.sai.SpringDataJpaLearn.entity.ManytoMany.Employee;
import com.sai.SpringDataJpaLearn.entity.ManytoMany.Project;
import com.sai.SpringDataJpaLearn.entity.onetomany.Address;
import com.sai.SpringDataJpaLearn.entity.onetomany.Customer;
import com.sai.SpringDataJpaLearn.entity.onetoone.Certification;
import com.sai.SpringDataJpaLearn.entity.onetoone.Student;
import com.sai.SpringDataJpaLearn.repository.*;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Service
@AllArgsConstructor
public class SampleService {

    public final StudentRepo studentRepo;
    public final CertificationRepo certificationRepo;

    private final CustomerRepo customerRepo;
    private final AddressRepo addressRepo;

    private final EmployeeRepo employeeRepo;
    private final ProjectRepo projectRepo;

    public Student saveStudent1to1(Student student) {
        return studentRepo.save(student);
    }

    public Student getStudentById(Integer id) {
        return studentRepo.findById(id).orElse(null);
    }

    public Certification getCertById(Integer id) {
        return certificationRepo.findById(id).orElse(null);
    }

    public Customer saveCustomer(Customer customer) {

        return customerRepo.save(customer);

    }

    public Customer gerCustomerById(UUID id) {
        return customerRepo.findById(id).orElse(null);
    }

    public Address getAddressById(UUID id) {
        return addressRepo.findById(id).orElse(null);
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public Project saveProject(Project project) {
        return projectRepo.save(project);
    }

    public ResponseEntity<?> getEmployee(Long id) {
        if (id == null)
            return ResponseEntity.ok(employeeRepo.findAll());
        else
            return ResponseEntity.ok(employeeRepo.findById(id));
    }

    @Transactional
    public Employee assignEmpProj(Long empId, Long projId) {

        Employee e = employeeRepo.findById(empId).orElse(null);
        Project p = projectRepo.findById(projId).orElse(null);

        Set<Project> projeccts = e.getAssignedProjects();
        projeccts.add(p);

        e.setAssignedProjects(projeccts);

        Employee savedEmp = employeeRepo.save(e);

        return savedEmp;
    }
}
