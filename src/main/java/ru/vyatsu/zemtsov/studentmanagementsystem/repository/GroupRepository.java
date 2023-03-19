package ru.vyatsu.zemtsov.studentmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vyatsu.zemtsov.studentmanagementsystem.entity.Group;

public interface GroupRepository extends JpaRepository<Group, Long> {
}
