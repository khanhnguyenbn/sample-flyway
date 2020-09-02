package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Table(name = "student")
@Data
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


    @Column(name = "year_old")
    private String yearOld;


}
