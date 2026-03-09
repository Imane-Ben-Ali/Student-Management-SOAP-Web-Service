package com.example.sstudent_soap_service;

import com.example.students.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentService {

    private Map<Long, Student> students = new HashMap<>();

    public String addStudent(Student student) {
        students.put(student.getId(), student);
        return "Student added successfully";
    }

    public Student getStudentById(Long id) {
        return students.get(id);
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(students.values());
    }
}
