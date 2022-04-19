/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.novatec.backend.controller;

import com.novatec.backend.common.GenericResponse;
import com.novatec.backend.dto.DtoPerson;
import com.novatec.backend.service.interfaces.ITeacherServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Teacher")
public class TeacherController {
    
    @Autowired
    private ITeacherServices teacherService;

    @GetMapping("/{id}")
    public GenericResponse getStudent(@PathVariable Long id) {
        GenericResponse response = new GenericResponse();

        try {
            response.success(teacherService.getTeacher(id));
        } catch (Exception ex) {
            response.failure(ex);
        }

        return response;
    }

    @GetMapping("/all")
    public GenericResponse getStudents() {
        GenericResponse response = new GenericResponse();
        try {
            response.success(teacherService.getTeachers());
        } catch (Exception ex) {
            response.failure(ex);
        }
        return response;
    }

    @PostMapping()
    public GenericResponse saveStudent(@RequestBody DtoPerson student) {
        GenericResponse response = new GenericResponse();
        try {
            teacherService.saveTeacher(student);
            response.success();
        } catch (Exception ex) {
            response.failure(ex);
        }
        return response;
    }

    @PutMapping("/{id}")
    public GenericResponse updateStudent(@PathVariable Long id, @RequestBody DtoPerson student) {
        GenericResponse response = new GenericResponse();
        try {
            teacherService.updateTeacher(id, student);
            response.success();
        } catch (Exception ex) {
            response.failure(ex);
        }
        return response;
    }

    @DeleteMapping("/{id}")
    public GenericResponse deleteStudent(@PathVariable Long id) {
        GenericResponse response = new GenericResponse();
        try {
            teacherService.deleteTeacher(id);
            response.success();
        } catch (Exception ex) {
            response.failure(ex);
        }
        return response;
    }
}
