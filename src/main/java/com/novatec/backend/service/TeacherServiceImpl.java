package com.novatec.backend.service;

import com.novatec.backend.dao.ITeacherDao;
import com.novatec.backend.dto.DtoPerson;
import com.novatec.backend.entity.Teacher;
import com.novatec.backend.service.interfaces.ITeacherServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TeacherServiceImpl implements ITeacherServices{
    
    @Autowired
    private ITeacherDao teacherDao;

    @Override
    @Transactional()
    public void saveTeacher(DtoPerson student) {
        Teacher newTeacher = new ModelMapper().map(student, Teacher.class);
        teacherDao.save(newTeacher);
    }

    @Override
    @Transactional()
    public void updateTeacher(Long id, DtoPerson student) {
        Teacher editTeacher = new ModelMapper().map(student, Teacher.class);
        editTeacher.setId(id);
        teacherDao.save(editTeacher);
    }

    @Override
    @Transactional()
    public void deleteTeacher(Long id) {
        teacherDao.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Teacher getTeacher(Long id) {
        return teacherDao.getById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Teacher> getTeachers() {
        return teacherDao.findAll();
    }
    
}
