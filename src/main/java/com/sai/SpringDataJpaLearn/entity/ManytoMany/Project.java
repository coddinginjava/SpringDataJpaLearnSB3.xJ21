package com.sai.SpringDataJpaLearn.entity.ManytoMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long proj_id;
    private String proj_name;


    @ManyToMany(mappedBy = "assignedProjects",fetch = FetchType.EAGER)
//    @JsonBackReference
    private Set<Employee> employees = new HashSet<>();

}
