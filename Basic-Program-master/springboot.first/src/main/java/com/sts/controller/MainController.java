package com.sts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	/*
	 * if u want to make a jsp then u have to make 2 folders like webapp and views
	 * inside the src     ->    main
	 */
	/*
	 * and we have to insert the dependencies tomcat embedded jasper maven this
	 * Dependencies use to convert jsp page into servlet page
	 */
	
	/*
	 * and then we have to specifies the folder of jsp file as well as jsp file name
	 * inside src/main/resources-----> into application.properties
	 * like
	 * 
	 * spring.mvc.view.prefix=/views/
	 * spring.mvc.view.suffix=.jsp
	 */

	@RequestMapping("/")
	public String home() {
		return "home";
	}
	@RequestMapping("/contact")
	public String contact() {
		return "contact";
	}

}
