package com.SMAPI.StudentManagementAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SMAPI.StudentManagementAPI.model.SMAModel;
import com.SMAPI.StudentManagementAPI.service.SMAService;

@RestController
public class SMAController {

    @Autowired
    SMAService studentService;

    @GetMapping("/students/all")
    public List<SMAModel> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping("/students/add")
    public SMAModel addStudent(@RequestBody SMAModel student) {
        return studentService.addStudent(student);
    }

    @DeleteMapping("/students/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return "Student deleted successfully";
    }

    @GetMapping("/students/get/{id}")
    public SMAModel getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    @PutMapping("/students/update/{id}")
    public SMAModel updateStudent(@PathVariable Long id, @RequestBody SMAModel studentDetails) {
        return studentService.updateStudent(id, studentDetails);
    }
}
