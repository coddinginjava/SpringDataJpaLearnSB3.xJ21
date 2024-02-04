package com.sai.SpringDataJpaLearn.repository;

import com.sai.SpringDataJpaLearn.entity.onetoone.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
}
