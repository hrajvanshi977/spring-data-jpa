package com.poc.springdatajpa.repository;

import com.poc.springdatajpa.model.Course;
import com.poc.springdatajpa.model.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CourseMaterialRepositoryTest {

    @Autowired
    private CourseMaterialRepository courseMaterialRepository;

    @Test
    void saveSomeCourseMaterial() {
        Course course =
                Course.builder()
                        .title("Object Oriented Programming system")
                        .credit(6)
                        .build();
        CourseMaterial courseMaterial =
                CourseMaterial.builder()
                        .url("www.meta.com")
                        .course(course)
                        .build();
        courseMaterialRepository.save(courseMaterial);
    }

    @Test
    void printCourseMaterials() {
        List<CourseMaterial> courseMaterials
                = courseMaterialRepository.findAll();
        System.out.println("courseMaterials = " + courseMaterials);
    }
    @Test
    void printCourses() {
        List<CourseMaterial> courseMaterials
                = courseMaterialRepository.findAll();
        System.out.println("courseMaterials = " + courseMaterials);
    }
}