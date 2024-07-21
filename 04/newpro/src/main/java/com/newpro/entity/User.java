package com.newpro.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="newstudent")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {


    @Id
    @Column(name = "ID")
    @GeneratedValue
    private int id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "MARKS")
    private String marks;

    @Column(name = "VILLAGE")
    private String village;
}
