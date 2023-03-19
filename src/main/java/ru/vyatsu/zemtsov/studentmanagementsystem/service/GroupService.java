package ru.vyatsu.zemtsov.studentmanagementsystem.service;

import ru.vyatsu.zemtsov.studentmanagementsystem.entity.Group;
import ru.vyatsu.zemtsov.studentmanagementsystem.entity.Student;

import java.util.List;

public interface GroupService {
    List<Group> getAllGroups();
    Group getGroup(Long id);
}
