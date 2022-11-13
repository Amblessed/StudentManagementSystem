package com.springboot.studentmanagementsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.javafaker.Faker;
import com.springboot.studentmanagementsystem.entity.Student;
import com.springboot.studentmanagementsystem.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) {
		
		/* Faker faker = new Faker();
		String firstName = faker.name().firstName();
		String lastName = faker.name().lastName();
		String email = String.format("%s.%s@gmail.com", firstName.toLowerCase(), lastName.toLowerCase());
		Student student = new Student(firstName, lastName, email);
		studentRepository.save(student);

		firstName = faker.name().firstName();
		lastName = faker.name().lastName();
		email = String.format("%s.%s@gmail.com", firstName.toLowerCase(), lastName.toLowerCase());
		student = new Student(firstName, lastName, email);
		studentRepository.save(student);

		firstName = faker.name().firstName();
		lastName = faker.name().lastName();
		email = String.format("%s.%s@gmail.com", firstName.toLowerCase(), lastName.toLowerCase());
		student = new Student(firstName, lastName, email);
		studentRepository.save(student); */
	} 

	

}
