package com.naren.StudentRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.naren.StudentRegistration.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
