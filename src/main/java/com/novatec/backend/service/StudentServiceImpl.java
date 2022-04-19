package com.novatec.backend.service;

import com.novatec.backend.dao.IStudentDao;
import com.novatec.backend.dto.DtoPerson;
import com.novatec.backend.entity.Student;
import com.novatec.backend.service.interfaces.IStudentServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.modelmapper.ModelMapper;

@Service
public class StudentServiceImpl implements IStudentServices {
    
    @Autowired
    private IStudentDao studentDao;

    @Override
    @Transactional()
    public void saveStudent(DtoPerson student) {
        Student newStudent = new ModelMapper().map(student, Student.class);
        studentDao.save(newStudent);
    }

    @Override
    @Transactional()
    public void updateStudent(Long id, DtoPerson student) {
        Student newStudent = new ModelMapper().map(student, Student.class);
        newStudent.setId(id);
        studentDao.save(newStudent);
    }

    @Override
    @Transactional()
    public void deleteStudent(Long id) {
        studentDao.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Student getStudent(Long id) {
        return studentDao.getById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Student> getStudents() {
        return studentDao.findAll();
    }
    
}
