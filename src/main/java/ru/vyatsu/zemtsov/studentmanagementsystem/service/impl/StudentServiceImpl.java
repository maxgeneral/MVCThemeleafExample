package ru.vyatsu.zemtsov.studentmanagementsystem.service.impl;

import org.springframework.stereotype.Service;
import ru.vyatsu.zemtsov.studentmanagementsystem.entity.Student;
import ru.vyatsu.zemtsov.studentmanagementsystem.service.StudentService;
import ru.vyatsu.zemtsov.studentmanagementsystem.repository.StudentRepository;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student findStudent(Student student) {
        return studentRepository.findStudentByFirstNameAndLastNameAndMiddleName(student.getFirstName(),
                student.getLastName(),
                student.getMiddleName());
    }
}
