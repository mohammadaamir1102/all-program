package com.dao;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.model.Student;

@Component
public class StudentDao {

	@Autowired
	private HibernateTemplate hibernTemplate;

	// create
	@Transactional
	public void creatStudent(Student student) {
		this.hibernTemplate.saveOrUpdate(student);

	}

	// get all
	public List<Student> getAllStudent() {
		List<Student> getAll = this.hibernTemplate.loadAll(Student.class);
		return getAll;
	}

	// delete single student
	@Transactional
	public void delStudent(int id) {
		Student load = this.hibernTemplate.load(Student.class, id);
		this.hibernTemplate.delete(load);
	}

	// get single student
	public Student getSingelStudent(int id) {
		return this.hibernTemplate.get(Student.class, id);

	}

}
