package com.example.jfs_data_jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    //Add a custom query within your interface.
    List<Student> findByName(String name);

}
