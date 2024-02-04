package com.sai.SpringDataJpaLearn.entity.onetomany;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID cust_id;
    private String cust_name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_cust_id",referencedColumnName = "cust_id")
    private List<Address> addresses;
}
