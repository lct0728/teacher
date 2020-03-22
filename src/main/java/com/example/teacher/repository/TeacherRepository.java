package com.example.teacher.repository;

import com.example.teacher.entity.Teacher;
import com.example.teacher.myrepository.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends BaseRepository<Teacher,Integer> {
}
