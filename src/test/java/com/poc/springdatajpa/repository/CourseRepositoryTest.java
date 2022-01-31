package com.poc.springdatajpa.repository;

import com.poc.springdatajpa.model.Course;
import com.poc.springdatajpa.model.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CourseRepositoryTest {

    @Autowired
    private CourseRepository courseRepository;

    @Test
    void printAllCourses() {
        List<Course> courses = courseRepository.findAll();
        System.out.println("courses = " + courses);
    }

    @Test
    void saveCourseWithTeacher() {
        Teacher teacher =
                Teacher.builder()
                        .firstName("Rahul")
                        .lastName("sharma")
                        .build();

        Course course =
                Course.builder()
                        .title("Jpa")
                        .credit(4)
                        .teacher(teacher)
                        .build();
        courseRepository.save(course);
    }
}
