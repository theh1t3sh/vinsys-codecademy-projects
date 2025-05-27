// package com.SMAPI.StudentManagementAPI.service;

// public class SMAService {

// }

package com.SMAPI.StudentManagementAPI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SMAPI.StudentManagementAPI.model.SMAModel;
import com.SMAPI.StudentManagementAPI.repository.SMARepository;

@Service
public class SMAService {

    @Autowired
    private SMARepository studentRepository;

    public SMAModel addStudent(SMAModel student) {
        return studentRepository.save(student);
    }

    public List<SMAModel> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<SMAModel> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    public SMAModel updateStudent(Long id, SMAModel studentDetails) {
        SMAModel student = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));

        student.setName(studentDetails.getName());
        student.setEmail(studentDetails.getEmail());
        student.setCourse(studentDetails.getCourse());

        return studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}