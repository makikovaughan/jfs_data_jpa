package com.example.jfs_data_jpa;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

    //Instance
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;

    //Create two different Constructors in your Student class. The first should take only the name as a parameter
    // and the second constructor should not take any parameters.
    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    //Create getters and setters for all of your instance fields.

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Create a method called toString().
    //This method should have a return type of String and should return your Student object as a String.
    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, name='%s']",
                id, name);
    }
}
