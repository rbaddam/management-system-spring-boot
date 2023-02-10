package com.rbaddam.managementsystem;

import com.rbaddam.managementsystem.entity.Student;
import com.rbaddam.managementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		Student student1 = new Student("Ram", "Charan", "Ram@gmail.com");
		studentRepository.save(student1);

		studentRepository.save(new Student("Prabhas", "Raju", "Prabhas@gmail.com"));
		studentRepository.save(new Student("Vijay", "Dev", "Vijay@gmail.com"));
		studentRepository.save(new Student("Tarak", "Nan", "Tarak@gmail.com"));
		studentRepository.save(new Student("Samantha", "Ruth", "Samantha@gmail.com"));

	}
}
