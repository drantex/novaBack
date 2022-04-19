package com.novatec.backend.dao;

import com.novatec.backend.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentDao extends JpaRepository<Student, Long>{
}
