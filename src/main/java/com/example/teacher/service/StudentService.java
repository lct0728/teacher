package com.example.teacher.service;

import com.example.teacher.entity.Student;
import com.example.teacher.entity.Teacher;
import com.example.teacher.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@Slf4j
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public void addStudent(Student student){
        studentRepository.save(student);
    }

    public Student getStudent(int id){
        Student student=studentRepository.find(id);
        return student;
    }

    public int update(int id,Teacher teacher){
       int number= studentRepository.update(id, teacher);//返回受影响的人数
       return number;
    }

}
