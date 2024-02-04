package com.sai.SpringDataJpaLearn.repository;

import com.sai.SpringDataJpaLearn.entity.onetomany.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AddressRepo extends JpaRepository<Address, UUID> {
}
