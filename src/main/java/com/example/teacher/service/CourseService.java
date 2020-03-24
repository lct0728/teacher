package com.example.teacher.service;

import com.example.teacher.entity.Course;
import com.example.teacher.repository.CourseRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@Slf4j
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;
    public void addCourse(Course course){
        courseRepository.save(course);
    }
    public Course getCourse(int id){
        Course course=courseRepository.find(id);
        return course;
    }
}
