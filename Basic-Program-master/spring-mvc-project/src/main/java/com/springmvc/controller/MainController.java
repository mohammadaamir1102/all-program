package com.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.model.StudentRegistration;
import com.springmvc.service.StudentService;

@Controller
public class MainController {

	@Autowired
	private StudentService studentService;

	@RequestMapping("/registrationPage")
	public String complexPage() {
		return "complex";
	}
	@RequestMapping("/recordPage")
	public String recordPage(@ModelAttribute StudentRegistration studentRegistration ,Model m) {
		List<StudentRegistration> layers = studentService.getLayer(studentRegistration);
		m.addAttribute("layer", layers);
		return "view";
		
	}

	@RequestMapping(path = "/form", method = RequestMethod.POST)
	public String handleRegistrationFrom(@ModelAttribute StudentRegistration studentRegistration, Model model) {

		System.out.println(studentRegistration);
		this.studentService.createLayer(studentRegistration);
		return "complex";

	}
	

}
