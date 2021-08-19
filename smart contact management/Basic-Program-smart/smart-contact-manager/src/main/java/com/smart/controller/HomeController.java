package com.smart.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.smart.entities.User;
import com.smart.helper.Message;
import com.smart.repo.UserRepository;

@Controller
public class HomeController {

	/*
	 * here passwordEncoder should be matched BCryptPasswordEncoder method which is
	 * declared inside MyConfig class like
	 * 
	 * public BCryptPasswordEncoder passwordEncoder() { return new
	 * BCryptPasswordEncoder();
	 * 
	 * }
	 * 
	 */
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Autowired
	private UserRepository userRepository;

	@RequestMapping("/")
	public String homePage(Model model) {
		model.addAttribute("title", "Home - Smart Contact Manager");
		return "home";
	}

	@RequestMapping("/about")
	public String about(Model model) {
		model.addAttribute("title", "About - Smart Contact Manager");
		return "about";
	}

	@RequestMapping("/signup")
	public String signup(Model model) {
		model.addAttribute("title", "signup - Smart Contact Manager");
		model.addAttribute("user", new User());
		return "signup";
	}

	/*
	 * i Used here @RequestParam because we don't have agreement data in user entity
	 * i provided default value false when i click check condition then will true
	 * automatically
	 * 
	 */

	/*
	 * here @Valid for Hibernate validator and BindingResult use for error like i
	 * did not write any thing is the field of userName column then error will be
	 * happened and return page sign-up in the sign up page i used bootstrap field
	 * for error showing inside the userName field
	 */
	@PostMapping("/do-register")
	public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result,
			@RequestParam(value = "agreement", defaultValue = "false") Boolean agreement, Model model,
			HttpSession session) {
		try {
			if (!agreement) {
				// here if terms & condition not accept then throw exception
				throw new Exception(" You should accept terms & conditions");
			}
			if (result.hasErrors()) {
				System.out.println("error" + result.toString());
				model.addAttribute("user", user);
				return "signup";
			}
			user.setRole("ROLE_USER");
			user.setEnabled(true);
			user.setUserImageURL("default.png");
			/*
			 * now get password from user and bCryptPasswordEncoder responsible to encode
			 * password And set again into database
			 */
			user.setUserPassword(passwordEncoder.encode(user.getUserPassword()));

			User result1 = this.userRepository.save(user);
			System.out.println(result1);
			model.addAttribute("user", new User());

			// if try not throw any exception then show success fully show in sing up page
			session.setAttribute("message", new Message("Successfully Registered !!", "alert-success"));

			return "signup";
		} catch (Exception e) {
			e.printStackTrace();

			// try block exception send in User and show in sing up page
			model.addAttribute("user", user);
			session.setAttribute("message", new Message("something went Wrong !!" + e.getMessage(), "alert-danger"));
		}
		return "signup";

	}
	
	@RequestMapping("/signin")
	public String customeLogin(Model model) {
		model.addAttribute("title", "Login - Smart Contact Manager");
		return "signin";
	}


}
