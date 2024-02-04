package com.sai.SpringDataJpaLearn.entity.onetoone;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Certification {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer cert_id;
    private String certName;

    //next 2 annotation is for bidirectional mapping
    @JsonIgnore
    @OneToOne(mappedBy = "certification")
    private Student s;
}
