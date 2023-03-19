package ru.vyatsu.zemtsov.studentmanagementsystem.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.hibernate.ObjectNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.vyatsu.zemtsov.studentmanagementsystem.entity.Student;
import ru.vyatsu.zemtsov.studentmanagementsystem.service.GroupService;
import ru.vyatsu.zemtsov.studentmanagementsystem.service.StudentService;

@Controller
@RequiredArgsConstructor
@Log
public class StudentController {
    private final StudentService studentService;
    private final GroupService groupService;

    // handler method to handle list students and return mode and view
    @GetMapping("/students")
    @ModelAttribute
    public String listStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }

    @GetMapping("/students/new")
    public String createStudentForm(Model model) {

        // create student object to hold student form data
        Student student = new Student();
        model.addAttribute("student", student);
        model.addAttribute("groups", groupService.getAllGroups());
        return "create_student";

    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student) throws Exception {
        studentService.saveStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/students/edit/{id}")
    public String editStudentForm(@PathVariable Long id, Model model) {
        model.addAttribute("student", studentService.getStudentById(id));
        model.addAttribute("groups", groupService.getAllGroups());
        return "edit_student";
    }

    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id,
                                @ModelAttribute("student") Student student,
                                Model model) {

        // get student from database by id
        Student existingStudent = studentService.getStudentById(id);
        existingStudent.setId(id);
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setMiddleName(student.getMiddleName());
        existingStudent.setGroup(student.getGroup());
        // save updated student object
        studentService.updateStudent(existingStudent);
        return "redirect:/students";
    }

    // handler method to handle delete student request

    @GetMapping ("/students/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudentById(id);
        return "redirect:/students";
    }
}
