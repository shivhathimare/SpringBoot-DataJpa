package com.my.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.app.model.Student;
import com.my.app.repo.StudentRepository;
import com.my.app.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository repo;
	

	@Override
	public Integer addStudent(Student s) {
		// TODO Auto-generated method stub
		return repo.save(s).getStdId();
		
	
	}

}
