package com.service;

import java.util.*;
import com.model.*;
public class StudentService {

	private List<Student> students=new ArrayList<Student>();
	
	public List<Student>   studentList()
	{
		Student student1=new Student();
		student1.setRoll(1);
		student1.setName("Raghav");
		Student student2=new Student();
		student2.setRoll(2);
		student2.setName("Ananda");
		students.add(student1);
		students.add(student2);
		
		return students;
	}
}
