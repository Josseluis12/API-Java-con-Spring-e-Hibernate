package com.example.CrudAccesoDatos.repository;

import com.example.CrudAccesoDatos.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
