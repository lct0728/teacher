package com.example.teacher.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int number;//可选人数
    @OneToMany(mappedBy = "teacher")
    private List<Student> students;//已选择的学生
    private String password;
}
