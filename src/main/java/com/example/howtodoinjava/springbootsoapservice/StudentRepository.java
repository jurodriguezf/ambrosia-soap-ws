package com.example.howtodoinjava.springbootsoapservice;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.howtodoinjava.xml.school.Student;

@Component
public class StudentRepository {
	private static final Map<String, Student> students = new HashMap<>();

	@PostConstruct
	public void initData() {

		Student student = new Student();
		student.setStudentCode("1");
		student.setAmount(100);
		student.setDescription("description");
		student.setDueDate("2018-01-01");
		student.setOverdueDate("2018-01-01");
		student.setInvoiceNumber("1");
		student.setStatus("pending");
		students.put(student.getStudentCode(), student);

	}

	public Student findStudent(String studentCode) {
		Assert.notNull(studentCode, "The Student's code must not be null");
		return students.get(studentCode);
	}
}