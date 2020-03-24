package com.example.teacher.service;

import com.example.teacher.entity.Course;
import com.example.teacher.entity.Grade;
import com.example.teacher.entity.Student;
import com.example.teacher.repository.GradeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@Slf4j
public class GradeService {
    @Autowired
    private GradeRepository gradeRepository;
    public void addGrade(Grade grade){
        gradeRepository.save(grade);
    }

    public List<Grade> getGrade(Student student){//想过直接传id，但这样查找的话，方法不能overload
        List<Grade> list=gradeRepository.listByStudent(student.getId());
        return list;
    }
    public List<Grade> getGrade(Course course){
        List<Grade> list=gradeRepository.listByCourse(course.getId());
        return list;
    }
    public Grade getGrade(Student student,Course course){
        Grade grade=gradeRepository.getOne(student.getId(), course.getId());
        return grade;
    }

}
