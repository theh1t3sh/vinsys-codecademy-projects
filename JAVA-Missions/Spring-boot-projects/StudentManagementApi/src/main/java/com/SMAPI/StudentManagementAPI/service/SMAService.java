package com.SMAPI.StudentManagementAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SMAPI.StudentManagementAPI.model.SMAModel;
import com.SMAPI.StudentManagementAPI.repository.SMARepository;

@Service
public class SMAService {

    @Autowired
    private SMARepository studentRepository;

    // Get all students
    public List<SMAModel> getAllStudents() {
        return studentRepository.findAll();
    }

    // Add new student
    public SMAModel addStudent(SMAModel student) {
        return studentRepository.save(student);
    }

    // Get student by ID (returns null if not found)
    public SMAModel getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    // Update student
    public SMAModel updateStudent(Long id, SMAModel studentDetails) {
        SMAModel student = studentRepository.findById(id).orElse(null);
        if (student != null) {
            student.setName(studentDetails.getName());
            student.setEmail(studentDetails.getEmail());
            student.setCourse(studentDetails.getCourse());
            return studentRepository.save(student);
        }
        return null;
    }

    // Delete student
    public String deleteStudent(Long id) {
        studentRepository.deleteById(id);
        return "Student with ID " + id + " deleted successfully";
    }
}
