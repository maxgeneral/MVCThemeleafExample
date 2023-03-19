package ru.vyatsu.zemtsov.studentmanagementsystem.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import ru.vyatsu.zemtsov.studentmanagementsystem.entity.Student;

import java.util.List;
public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);

    Student findStudent(Student student);
}
