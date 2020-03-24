package com.example.teacher.repository;

import com.example.teacher.entity.Course;
import com.example.teacher.myrepository.BaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends BaseRepository<Course,Integer> {
    @Query("from Course c where c.id=:cid")
    Course find(@Param("cid") int id);
}
