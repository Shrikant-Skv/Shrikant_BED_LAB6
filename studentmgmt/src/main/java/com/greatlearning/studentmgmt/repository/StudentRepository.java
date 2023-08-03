package com.greatlearning.studentmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.studentmgmt.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
