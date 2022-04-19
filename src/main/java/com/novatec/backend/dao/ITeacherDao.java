package com.novatec.backend.dao;

import com.novatec.backend.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITeacherDao extends JpaRepository<Teacher, Long>{
    
}
