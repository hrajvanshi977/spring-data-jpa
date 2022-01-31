package com.poc.springdatajpa.repository;

import com.poc.springdatajpa.model.Guardian;
import com.poc.springdatajpa.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;

    @Test
    void saveStudent() {
        Student student = Student.builder()
                .emailId("himanshu@gmail.com")
                .firstName("himanshu")
                .lastName("rajvanshi")
                .build();
        studentRepository.save(student);
    }

    @Test
    void saveDetailsWithGuardian() {
        Guardian guardian = Guardian.builder()
                .name("xyz")
                .email("xyz@gmail.com")
                .mobile("1234567890")
                .build();

        Student student = Student.builder()
                .firstName("himanshu")
                .emailId("himanshu3@gmail.com")
                .lastName("rajvanshi")
                .guardian(guardian)
                .build();
        studentRepository.save(student);
    }

    @Test
    void printStudentsByFirstName() {
        List<Student> students = studentRepository.findByFirstName("himanshu");
        System.out.println("students = " + students);
    }

    @Test
    void printFirstNameContaining() {
        List<Student> students = studentRepository.findByFirstNameContaining("hi");
        System.out.println("students = " + students);
    }

    @Test
    void printStudentBasedOnGuardianName() {
        List<Student> students = studentRepository.findByGuardianName("xyz");
        System.out.println("students = " + students);
    }

    @Test
    void printStudentByEmailAddress() {
        Student student = studentRepository.getStudentByEmailAddress("himanshu1@gmail.com");
        System.out.println("student = " + student);
    }

    @Test
    void printStudentFirstNameByEmailAddress() {
        String firstName = studentRepository.getStudentFirstNameByEmailAddress("himanshu1@gmail.com");
        System.out.println("firstName = " + firstName);
    }

    @Test
    void printStudentByEmailAddressNative() {
        Student student = studentRepository.getStudentByEmailAddressNative("himanshu1@gmail.com");
        System.out.println("student = " + student);
    }

    @Test
    void printStudentByEmailAddressNativeNamedParam() {
        Student student = studentRepository.getStudentByEmailAddressNativeNamedParam("himanshu1@gmail.com");
        System.out.println("student = " + student);
    }

    @Test
    void updateStudentByEmailId() {
        int updated = studentRepository.updateStudentByEmailId(
                "Rahul",
                "himanshu2@gmail.com");
        System.out.println("is updated = " + updated);
    }

    @Test
    void printAllStudent() {
        List<Student> students = studentRepository.findAll();
        System.out.println("students = " + students);
    }
}