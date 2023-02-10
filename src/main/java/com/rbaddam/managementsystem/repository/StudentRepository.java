package com.rbaddam.managementsystem.repository;

import com.rbaddam.managementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
