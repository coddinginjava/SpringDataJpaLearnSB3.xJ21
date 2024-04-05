package com.sai.SpringDataJpaLearn.repository;

import com.sai.SpringDataJpaLearn.entity.ManytoMany.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long> {
}
