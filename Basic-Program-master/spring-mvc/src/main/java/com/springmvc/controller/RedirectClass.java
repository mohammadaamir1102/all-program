package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectClass {
	/* this the first way */
	@RequestMapping("/one")
	public String one() {
		System.out.println("one");
		return "redirect:/two";
	}
	@RequestMapping("/two")
	public String two(Model model) {
		model.addAttribute("two", "this is the mapping class of two");
		System.out.println("two");
		return "redirect";
	}

	/* this is the second way */	
	@RequestMapping("/redirectview")
	public RedirectView Redi() {
		RedirectView redirectView = new RedirectView();
		/* here do't have to provide forward slash */
		System.out.println("this is the redirectviews method");
		redirectView.setUrl("two");
		//redirectView.setUrl("https://www.google.com");
		return redirectView;
	}

}
