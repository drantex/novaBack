package com.novatec.backend.service.interfaces;

import com.novatec.backend.dto.DtoPerson;
import com.novatec.backend.entity.Teacher;
import java.util.List;
public interface ITeacherServices {    
    public void saveTeacher(DtoPerson student);
    public void updateTeacher(Long id, DtoPerson student) ;
    public void deleteTeacher(Long id);
    public Teacher getTeacher(Long id);
    public List<Teacher> getTeachers();
}
