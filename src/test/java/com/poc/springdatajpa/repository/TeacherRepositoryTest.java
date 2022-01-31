package com.poc.springdatajpa.repository;

import com.poc.springdatajpa.model.Course;
import com.poc.springdatajpa.model.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository teacherRepository;

  /*  @Test
    void saveTeacher() {
        Course courseDba =
                Course.builder()
                        .title("DBA")
                        .credit(5)
                        .build();

        Course courseJava =
                Course.builder()
                        .title("JAVA")
                        .credit(5)
                        .build();

        Teacher teacher =
                Teacher.builder()
                        .firstName("dharmendra")
                        .lastName("choudhary")
                        .courses(List.of(courseDba, courseJava))
                        .build();
        teacherRepository.save(teacher);
    }*/
}