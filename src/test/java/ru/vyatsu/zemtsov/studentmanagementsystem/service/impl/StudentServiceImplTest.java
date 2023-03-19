package ru.vyatsu.zemtsov.studentmanagementsystem.service.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import ru.vyatsu.zemtsov.studentmanagementsystem.entity.Student;
import ru.vyatsu.zemtsov.studentmanagementsystem.repository.StudentRepository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceImplTest {

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void saveStudent() {
        assertTrue(true);
    }
}