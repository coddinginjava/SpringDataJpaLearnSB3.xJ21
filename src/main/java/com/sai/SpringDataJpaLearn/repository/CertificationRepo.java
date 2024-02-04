package com.sai.SpringDataJpaLearn.repository;

import com.sai.SpringDataJpaLearn.entity.onetoone.Certification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertificationRepo extends JpaRepository<Certification,Integer> {
}
