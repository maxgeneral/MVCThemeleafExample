package ru.vyatsu.zemtsov.studentmanagementsystem.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

@Entity
@Table(name = "students")
@Data
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial", insertable=false, updatable = false)
    private Long id;

    @Column(name = "credit_card", nullable = false)
    @Comment(value = "Номер зачетной книжки")
    private String creditCard;

    @Column(name = "first_name", nullable = false)
    @Comment(value = "Имя студента")
    private String firstName;

    @Column(name = "last_name", nullable = false)
    @Comment(value = "Фамилия студента")
    private String lastName;

    @Column(name = "middle_name", nullable = false)
    @Comment(value = "Отчество студента")
    private String middleName;

    @ManyToOne
    @JoinColumn(name = "group_id")
    @Comment(value = "Учебная группа")
    private Group group;
}