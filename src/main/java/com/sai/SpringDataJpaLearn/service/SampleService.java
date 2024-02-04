package com.sai.SpringDataJpaLearn.service;

import com.sai.SpringDataJpaLearn.entity.onetoone.Certification;
import com.sai.SpringDataJpaLearn.entity.onetoone.Student;
import com.sai.SpringDataJpaLearn.repository.CertificationRepo;
import com.sai.SpringDataJpaLearn.repository.StudentRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SampleService {

    public final StudentRepo studentRepo;
    public final CertificationRepo certificationRepo;

    public Student saveStudent1to1(Student student) {
        return studentRepo.save(student);
    }

    public Student getStudentById(Integer id) {
        return studentRepo.findById(id).orElse(null);
    }

    public Certification getCertById(Integer id) {
        return certificationRepo.findById(id).orElse(null);
    }
}
