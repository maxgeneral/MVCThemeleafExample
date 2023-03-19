package ru.vyatsu.zemtsov.studentmanagementsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import ru.vyatsu.zemtsov.studentmanagementsystem.repository.StudentRepository;

@SpringBootApplication
@EnableConfigurationProperties
public class StudentManagementSystemApplication {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private StudentRepository groupRepository;

    public static void main(String[] args) {
        new SpringApplicationBuilder(StudentManagementSystemApplication.class)
                .bannerMode(Banner.Mode.OFF)
                .run(args);
    }
}
