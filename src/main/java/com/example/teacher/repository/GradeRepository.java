package com.example.teacher.repository;

import com.example.teacher.entity.Grade;
import com.example.teacher.myrepository.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeRepository extends BaseRepository<Grade,Integer> {
}
