package com.sai.SpringDataJpaLearn.entity.ManytoMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long emp_id;
    private String emp_name;

    @CreationTimestamp
    private Timestamp createdOn;

    @UpdateTimestamp
    private Timestamp updatedTimeStamp;

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinTable(name = "emp_proj_assign", joinColumns = @JoinColumn(name = "emp_id_id",referencedColumnName = "emp_id")
            , inverseJoinColumns = @JoinColumn(name = "proj_id_id",referencedColumnName = "proj_id"))
//            @JsonManagedReference
    private Set<Project> assignedProjects = new HashSet<>();
}
