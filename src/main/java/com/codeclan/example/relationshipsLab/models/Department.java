package com.codeclan.example.relationshipsLab.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "departments")

public class Department {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column
    private List<Employee> employees;
}
