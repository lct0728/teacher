package com.example.teacher.repository;

import com.example.teacher.entity.Course;
import com.example.teacher.myrepository.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends BaseRepository<Course,Integer> {
}
