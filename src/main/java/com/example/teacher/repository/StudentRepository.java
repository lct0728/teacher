package com.example.teacher.repository;

import com.example.teacher.entity.Student;
import com.example.teacher.entity.Teacher;
import com.example.teacher.myrepository.BaseRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends BaseRepository<Student,Integer> {
    @Query("from Student s where s.id=:sid")
    Student find(@Param("sid") int id);

    @Modifying
    @Query("update Student s set s.teacher=:teacher where s.id=:id")
    int update(@Param("id")int id, @Param("teacher")Teacher teacher);
}
