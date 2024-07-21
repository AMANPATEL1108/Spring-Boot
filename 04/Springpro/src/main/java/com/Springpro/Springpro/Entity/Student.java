package com.Springpro.Springpro.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="form")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @Column(name="ID")
    @GeneratedValue
    private int id;

    @Column(name="MARK")
    private int mark;

    @Column(name="NAME")
    private String name;

}
