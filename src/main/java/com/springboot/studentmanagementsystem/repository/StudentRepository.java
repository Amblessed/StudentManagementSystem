package com.springboot.studentmanagementsystem.repository;

/*
 * @Project Name: StudentManagementSystem
 * @Author: Okechukwu Bright Onwumere
 * @Created: 13/11/2022
 */


import com.springboot.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
