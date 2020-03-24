package com.example.teacher.service;


import com.example.teacher.entity.Teacher;
import com.example.teacher.repository.TeacherRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@Slf4j
public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

    public void addTeacher(Teacher teacher){
        teacherRepository.save(teacher);
    }
    public Teacher getTeacher(int id){//就一个老师，还是传一个id
        Teacher teacher=teacherRepository.find(id);
        return teacher;
    }
}
