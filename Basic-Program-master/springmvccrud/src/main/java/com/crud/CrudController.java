package com.crud;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.dao.StudentDao;
import com.model.Student;

@Controller
public class CrudController {

	@Autowired
	private StudentDao studentDao;

	// this is for -> all data on success page
	@RequestMapping("/success")
	public String home(Model m) {
		List<Student> allStudent = studentDao.getAllStudent();
		m.addAttribute("allStudent", allStudent);
		System.out.println("running success");
		return "succes";
	}
	

	// show add details form
	@RequestMapping("/")
	public String addStudent(Model model) {
		return "add";
	}

	@RequestMapping("/add")
	public String add(Model model) {
		model.addAttribute("title", "Add product");
		return "add";
	}

	/*
	 * here httpServletRequest is use for holding the url bar or we can provide any
	 * path of pages on /home when i clicked on add button then call the home page
	 */

	// it is from when i hit form button then called /fromHandler
	@RequestMapping(value = "/formHandle", method = RequestMethod.POST)
	public RedirectView formHandle(@ModelAttribute Student student, HttpServletRequest request) {
		System.out.println(student);
		studentDao.creatStudent(student);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}

	/*
	 * @RequestMapping(value = "/formHandle", method = RequestMethod.POST) public
	 * String formHandle(@ModelAttribute Student student, Model model) {
	 * System.out.println(student); this.studentDao.creatStudent(student); return
	 * "succes"; }
	 */

	// delete handler

	/*
	 * @PathVariable annotation can be used to handle template variables in the
	 * request URI mapping,
	 */
	/*
	 * here id is the template variable which is the define in the Dao class into
	 * deleteStudent and getSingleStudent
	 */
	@RequestMapping("/delete/{id}")
	public RedirectView delete(@PathVariable("id") int id, HttpServletRequest request) {
		studentDao.delStudent(id);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/success");
		return redirectView;
	}
	
	@RequestMapping("/update/{id}")
	public String update(@PathVariable("id") int id,Model model) {
		Student singelStudent =this.studentDao.getSingelStudent(id);
		model.addAttribute("singelStudent", singelStudent);
		return "updatePage";
		
	}
}
