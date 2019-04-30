package com.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Student;
import com.service.StudentService;

@Controller
public class StudentContoller {
   
	   @RequestMapping("/")
	    public String displayAllStudents(Model model)
	    {
	      StudentService studentService=new StudentService(); 
	      List<Student> studentList=studentService.studentList();
	      model.addAttribute("studentList",studentList);
	      return "disp";
	    }
}
