package com.springmvc.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.controller.model.User;
import com.springmvc.controller.service.ServiceLayer;

@Controller
public class MainController {
	/*
	 * here inject object of ServiceLayer is implicitly by IOC so that's why use here
	 * @Autowired
	 */
	@Autowired
	private ServiceLayer serviceLayer;

	@RequestMapping("/home")
	/* Model is an interface it is just like container and contain the data */
	public String show(Model model) {
		System.out.println("hello jsp page");

		/* here name is key and aamir khan u r good boy is a values */
		model.addAttribute("name", "Aamir khan u r good guys");

		/* here index is as jsp page */
		return "index";
	}

	@RequestMapping("/view")
	public ModelAndView view() {
		/* here ModelAndView is a class that also contain the data */

		ModelAndView modelAndView = new ModelAndView();
		List<String> list = new ArrayList<String>();
		Collections.addAll(list, "Aamir khan", "salman khan", "Aasim khan");
		modelAndView.addObject("listdata", list);
		/* here model is a jsp page */
		modelAndView.setViewName("model");
		System.out.println("run view page");
		return modelAndView;
	}

	@RequestMapping("/jstlTraverse")
	public ModelAndView jstlTreverse() {
		ModelAndView modelAndView = new ModelAndView();
		List<String> list = new ArrayList<String>();
		Collections.addAll(list, "Aamir khan", "Salman khan", "furqan khan", "ramzan ali");
		modelAndView.addObject("mark", list);
		modelAndView.setViewName("jstlview");
		return modelAndView;

		/*
		 * String nameString="hello aamir khan";//this is value return new
		 * ModelAndView("here jsp name","here key","here value variable =namestring")
		 */
	}

	@RequestMapping("/pages")
	public String Handle() {
		return "form";
	}

	@RequestMapping(path = "/handleform", method = RequestMethod.POST)
	/*
	 * here we can use model interface it choice on me if we add any data so use
	 * otherwise can use and cannot use
	 */
	public String registerController(@ModelAttribute User user, Model model) {
		System.out.println(user);
		this.serviceLayer.createLayer(user);
		return "views";

	}

}
