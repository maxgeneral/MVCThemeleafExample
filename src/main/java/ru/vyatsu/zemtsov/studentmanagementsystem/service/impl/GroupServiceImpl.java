package ru.vyatsu.zemtsov.studentmanagementsystem.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.vyatsu.zemtsov.studentmanagementsystem.entity.Group;
import ru.vyatsu.zemtsov.studentmanagementsystem.entity.Student;
import ru.vyatsu.zemtsov.studentmanagementsystem.repository.GroupRepository;
import ru.vyatsu.zemtsov.studentmanagementsystem.repository.StudentRepository;
import ru.vyatsu.zemtsov.studentmanagementsystem.service.GroupService;
import ru.vyatsu.zemtsov.studentmanagementsystem.service.StudentService;

import java.util.ArrayList;
import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {
    private final GroupRepository groupRepository;
    public GroupServiceImpl (GroupRepository groupRepository) {
        super();
        this.groupRepository = groupRepository;
    }
    @Override
    public List<Group> getAllGroups() { return new ArrayList<Group>(groupRepository.findAll()); }

    @Override
    public Group getGroup(Long id) {
        return groupRepository.getById(id);
    }
}