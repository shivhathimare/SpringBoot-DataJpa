package com.my.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.my.app.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
