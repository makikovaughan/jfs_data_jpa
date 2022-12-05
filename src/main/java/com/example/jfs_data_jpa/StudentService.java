package com.example.jfs_data_jpa;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    //Instance
    private final StudentRepository studentRepository;

    //Constructor
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    //Create a method called getStudents(). This method should have a return type of List<Student> and
    //should return a call to the findAll() method from your StudentRepository interface.
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    //Create a method called findOne(). This method should have a return type of Optional<Student> and
    //should return a call to the findById() method from your StudentRepository interface.
    public Optional<Student> findOne(Long studentId) {
        return studentRepository.findById(studentId);
    }

    //Create a method called findByName(). This method should have a return type of List<Student> and
    //should take in one parameter of type String named studentName. This method should return a call to
    //your findByName() method from the StudentRepository interface. Pass in studentName as the argument for
    // your findByName() method.
    public List<Student> findByName(String studentName) {
        return studentRepository.findByName(studentName);
    }

    //Create a method called addStudent(). This method should not return anything and should take in one parameter
    //of type Student named student. This method should call the .save() method from your StudentRepository
    //interface. Pass in student as the argument for the .save() method.
    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    //Create a method called deleteStudent(). This method should not return anything and should take
    //in one parameter of type Long named studentId.This method should call the deleteById method from your
    //StudentRepository interface. Pass in studentId as the argument for the deleteById() method.
    public void deleteStudent(Long studentId) {
        studentRepository.deleteById(studentId);
    }


}
