package com.smart.controller;

import java.security.Principal;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smart.entities.Contact;
import com.smart.entities.User;
import com.smart.helper.Message;
import com.smart.repo.UserRepository;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	/* this is use for common data we can show name of logged-in user */
	@ModelAttribute
	public void addCommonData(Model model, Principal principal) {
		String userEmail = principal.getName();
		System.out.println(userEmail);

		User user = userRepository.findByUserEmail(userEmail);
		System.out.println(user);
		model.addAttribute("user", user);

	}

	// dash board home
	@GetMapping("/index")
	public String dashBoard(Model model, Principal principal) {

		model.addAttribute("title", "Dashboard");
		return "user/user_dashboard";
	}

	// open add form handler
	@GetMapping("/add-contact")
	public String openAddContactForm(Model model) {
		model.addAttribute("title", "Add Contact");
		model.addAttribute("contact", new Contact());
		return "user/add_contact";
	}

	@PostMapping("/process-contact")
	public String BlogProcess(@ModelAttribute("contact") Contact contact,
			Principal principal, HttpSession session) {

		try {
			
			String name = principal.getName();
			User user = this.userRepository.findByUserEmail(name);
			
			contact.setUser(user);
			
			user.getContacts().add(contact);
			this.userRepository.save(user);
			
			//message success
			System.out.println(user);
			session.setAttribute("message", new Message("Contact Addedd Successfully !! Add more..", "success"));
			System.out.println(contact);

		} catch (Exception e) {
			System.out.println(e);

			//message error
			session.setAttribute("message", new Message("something went Wrong !!", "danger"));
		}

		return "user/add_contact";

	}

}
