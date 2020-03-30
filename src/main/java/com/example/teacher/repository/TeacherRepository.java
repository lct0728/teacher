package com.example.teacher.repository;

import com.example.teacher.entity.Teacher;
import com.example.teacher.myrepository.BaseRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends BaseRepository<Teacher,Integer> {
    @Query("from Teacher t where t.id=:tid")
    Teacher find(@Param("tid") int id);

    @Modifying
    @Query("update Teacher t set t.password=:password where t.id=:id")
    int update(@Param("id")int id,@Param("password")String password);
}
