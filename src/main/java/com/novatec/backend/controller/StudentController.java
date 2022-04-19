package com.novatec.backend.controller;

import com.novatec.backend.common.GenericResponse;
import com.novatec.backend.dto.DtoPerson;
import com.novatec.backend.service.interfaces.IStudentServices;
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
@RequestMapping("/Student")
public class StudentController {

    @Autowired
    private IStudentServices studentService;

    @GetMapping("/{id}")
    public GenericResponse getStudent(@PathVariable Long id) {
        GenericResponse response = new GenericResponse();

        try {
            response.success(studentService.getStudent(id));
        } catch (Exception ex) {
            response.failure(ex);
        }

        return response;
    }

    @GetMapping("/all")
    public GenericResponse getStudents() {
        GenericResponse response = new GenericResponse();
        try {
            response.success(studentService.getStudents());
        } catch (Exception ex) {
            response.failure(ex);
        }
        return response;
    }

    @PostMapping()
    public GenericResponse saveStudent(@RequestBody DtoPerson student) {
        GenericResponse response = new GenericResponse();
        try {
            studentService.saveStudent(student);
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
            studentService.updateStudent(id, student);
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
            studentService.deleteStudent(id);
            response.success();
        } catch (Exception ex) {
            response.failure(ex);
        }
        return response;
    }
}
