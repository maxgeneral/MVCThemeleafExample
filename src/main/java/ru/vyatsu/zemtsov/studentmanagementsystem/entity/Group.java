package ru.vyatsu.zemtsov.studentmanagementsystem.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="groups")
@NoArgsConstructor
@Data
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial", insertable=false, updatable = false)
    private Long id;
    @Column(name="name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "group")
    private Set<Student> students = new HashSet<>();
}
