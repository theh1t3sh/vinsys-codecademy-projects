package com.SMAPI.StudentManagementAPI.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import com.SMAPI.StudentManagementAPI.model.SMAModel;
import com.SMAPI.StudentManagementAPI.service.SMAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

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
        return studentService.getStudentById(id).orElse(null);
    }

    @PutMapping("/students/update/{id}")
    public SMAModel updateStudent(@PathVariable Long id, @RequestBody SMAModel studentDetails) {
        return studentService.updateStudent(id, studentDetails);
    }
}

// // package com.SMAPI.StudentManagementAPI.controller;

// // public class SMAController {

// // }

// package com.SMAPI.StudentManagementAPI.controller;

// import java.util.List;
// import java.util.Optional;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// // import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import com.SMAPI.StudentManagementAPI.model.SMAModel;
// import com.SMAPI.StudentManagementAPI.service.SMAService;

// @RestController
// // @RequestMapping("/api/students")
// public class SMAController {

// @Autowired
// private SMAService studentService;

// @GetMapping
// public List<SMAModel> getAllStudents() {
// return studentService.getAllStudents();
// }

// @PostMapping
// public SMAModel addStudent(@RequestBody SMAModel student) {
// return studentService.addStudent(student);
// }

// @GetMapping("/{id}")
// public ResponseEntity<SMAModel> getStudentById(@PathVariable Long id) {
// Optional<SMAModel> student = studentService.getStudentById(id);
// return student.map(ResponseEntity::ok)
// .orElseGet(() -> ResponseEntity.notFound().build());
// }

// @PutMapping("/{id}")
// public ResponseEntity<SMAModel> updateStudent(@PathVariable Long id,
// @RequestBody SMAModel studentDetails) {
// try {
// SMAModel updatedStudent = studentService.updateStudent(id, studentDetails);
// return ResponseEntity.ok(updatedStudent);
// } catch (RuntimeException e) {
// return ResponseEntity.notFound().build();
// }
// }

// @DeleteMapping("/{id}")
// public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
// studentService.deleteStudent(id);
// return ResponseEntity.noContent().build();
// }
// }