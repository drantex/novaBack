/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.novatec.backend.service.interfaces;

import com.novatec.backend.dto.DtoPerson;
import com.novatec.backend.entity.Student;
import java.util.List;

/**
 *
 * @author stive
 */
public interface IStudentServices {
    public void saveStudent(DtoPerson student);
    public void updateStudent(Long id, DtoPerson student) ;
    public void deleteStudent(Long id);
    public Student getStudent(Long id);
    public List<Student> getStudents();
}
