package com.sai.SpringDataJpaLearn.entity.onetoone;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer student_id;
    private String stuName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_cert_id")
    private Certification certification;
}
