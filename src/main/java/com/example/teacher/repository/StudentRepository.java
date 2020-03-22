package com.example.teacher.repository;

import com.example.teacher.entity.Student;
import com.example.teacher.myrepository.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends BaseRepository<Student,Integer> {
}
