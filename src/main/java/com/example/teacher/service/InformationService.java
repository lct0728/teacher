package com.example.teacher.service;

import com.example.teacher.entity.Course;
import com.example.teacher.entity.Student;
import com.example.teacher.entity.Teacher;
import com.example.teacher.repository.CourseRepository;
import com.example.teacher.repository.StudentRepository;
import com.example.teacher.repository.TeacherRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@Slf4j
public class InformationService {
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private TeacherRepository teacherRepository;
    public Course addCourse(Course course){
        courseRepository.save(course);
        return course;
    }
    public Course getCourse(int id){
        Course course=courseRepository.find(id);
        return course;
    }



    public Student addStudent(Student student){
        studentRepository.save(student);
        return student;
    }

    public Student getStudent(int id){
        Student student=studentRepository.find(id);
        return student;
    }

    public int updateStudent(int id, Teacher teacher){
        int number= studentRepository.update(id, teacher);//返回受影响的人数
        return number;
    }




    public Teacher addTeacher(Teacher teacher){
        teacherRepository.save(teacher);
        return teacher;
    }
    public Teacher getTeacher(int id){//就一个老师，还是传一个id
        Teacher teacher=teacherRepository.find(id);
        return teacher;
    }
    public void updateTeacherPassword(int id,String password){
        teacherRepository.update(id,password);
    }
}
