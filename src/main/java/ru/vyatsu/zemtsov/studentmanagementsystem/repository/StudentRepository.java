package ru.vyatsu.zemtsov.studentmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import ru.vyatsu.zemtsov.studentmanagementsystem.entity.Student;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long>  {
    public List<Student> findAll();
    public Student findStudentByFirstNameAndLastNameAndMiddleName(String firstName, String lastName, String middleName);
}
