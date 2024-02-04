package com.sai.SpringDataJpaLearn.service;

import com.sai.SpringDataJpaLearn.entity.onetomany.Address;
import com.sai.SpringDataJpaLearn.entity.onetomany.Customer;
import com.sai.SpringDataJpaLearn.entity.onetoone.Certification;
import com.sai.SpringDataJpaLearn.entity.onetoone.Student;
import com.sai.SpringDataJpaLearn.repository.AddressRepo;
import com.sai.SpringDataJpaLearn.repository.CertificationRepo;
import com.sai.SpringDataJpaLearn.repository.CustomerRepo;
import com.sai.SpringDataJpaLearn.repository.StudentRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class SampleService {

    public final StudentRepo studentRepo;
    public final CertificationRepo certificationRepo;

    private final CustomerRepo customerRepo;
    private final AddressRepo addressRepo;

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

    public Address getAddressById(UUID id){
        return addressRepo.findById(id).orElse(null);
    }
}
