package com.example.teacher.repository;

import com.example.teacher.entity.Grade;
import com.example.teacher.myrepository.BaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GradeRepository extends BaseRepository<Grade,Integer> {
    @Query("from Grade g where g.student.id=:sid")
    List<Grade> listByStudent(@Param("sid")int sid);

    @Query("from Grade g where g.student.id=:sid and g.course.id=:cid")
    Grade getOne(@Param("sid")int sid,@Param("cid")int cid);

    @Query("from Grade g where g.course.id=:cid")
    List<Grade> listByCourse(@Param("cid")int cid);
}
