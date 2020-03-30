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

    public List<Grade> getGradeByStudentId(int id){//想过直接传id，但这样查找的话，方法不能overload
        List<Grade> list=gradeRepository.listByStudent(id);
        return list;
    }
    public List<Grade> getGradeByCourseId(int id){
        List<Grade> list=gradeRepository.listByCourse(id);
        return list;
    }
    public Grade getGradeByStudentCourse(int studentid,int courseid){
        Grade grade=gradeRepository.getOne(studentid, courseid);
        return grade;
    }

}
