package com.sl.respositries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sl.entities.Student;

@Repository
public interface StudentRepositry extends JpaRepository<Student, Integer>{
	
	

}
