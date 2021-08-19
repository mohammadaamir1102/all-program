package com.sts;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sts.model.Student;
import com.sts.repo.StudentRepo;

@SpringBootApplication
public class SpringbootdbconnectivityApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootdbconnectivityApplication.class, args);
		StudentRepo studentRepo = context.getBean(StudentRepo.class);

		Student student1 = new Student();
		student1.setName("Aamir khan");
		student1.setAddress("saki naka");
		student1.setCity("Mumbai");

		Student student2 = new Student();
		student2.setName("Aasim khan");
		student2.setAddress("Millat Nager");
		student2.setCity("Basti");

		Student student3 = new Student();
		student3.setName("Aaquib khan");
		student3.setAddress("Millat Nager");
		student3.setCity("Basti");

		// save separate record
		/*
		 * Student save1 = studentRepo.save(student1);
		 * System.out.println("first record saved"+save1);
		 * 
		 * 
		 * Student save2 = studentRepo.save(student2);
		 * System.out.println("second record saved"+save2);
		 * 
		 * 
		 * Student save3 = studentRepo.save(student3);
		 * System.out.println("third record saved"+save3);
		 */

		// save all at a time first way
		/*
		 * List<Student> list = Arrays.asList(student1, student2, student3);
		 * List<Student> saveAll = studentRepo.saveAll(list); saveAll.forEach(a -> {
		 * System.out.println(a); });
		 */

		/*
		 * save all second way List<Student>list=new LinkedList<>();
		 * Collections.addAll(list,student1,student2,student3);
		 * studentRepo.saveAll(list); list.forEach(System.out::println);
		 */

		// find details by id
		/*
		 * Optional<Student> findById = studentRepo.findById(2); Student student =
		 * findById.get(); System.out.println(student);
		 */

		// update details
		/*
		 * Optional<Student> findById = studentRepo.findById(3); Student student =
		 * findById.get(); student.setName("salman khan"); Student save =
		 * studentRepo.save(student); System.out.println(save);
		 */

		// find all
		/*
		 * List<Student> findAll = studentRepo.findAll(); findAll.forEach(a ->
		 * System.out.println(a));
		 */
		// delete by id
		/*
		 * studentRepo.deleteById(3); System.out.println("deleted");
		 */

		// delete all
		/*
		 * List<Student> findAll2 = studentRepo.findAll();
		 * findAll2.forEach(a->System.out.println(a)); studentRepo.deleteAll(findAll2);
		 */

		// for counting how many data present in the database
		/*
		 * long count = studentRepo.count(); System.out.println(count);
		 */
		/*
		 * List<Student> findAll = studentRepo.findAll();
		 * findAll.forEach(a->System.out.println(a));
		 */

		// if here we want to fetch data by name then we have to make a method
		// inside studentrepo interface then pass here the method
		/*
		 * List<Student> list = studentRepo.findByName("Aamir khan");
		 * list.forEach(a->System.out.println(a));
		 */

		// spring data supported keywords or derived this method findByNameAndCity
		// declared inside the studentrepo interface
		/*
		 * List<Student> findByNameAndCity = studentRepo.findByNameAndCity("Aasim khan",
		 * "basti"); findByNameAndCity.forEach(a -> System.out.println(a));
		 */

		// find data by id range

		/*
		 * List<Student> findByIdBetween = studentRepo.findByIdBetween(3, 8);
		 * findByIdBetween.forEach(a -> System.out.println(a));
		 */

		/*
		 * List<Student> findByIdGreaterThan = studentRepo.findByIdGreaterThan(3);
		 * findByIdGreaterThan.forEach(a->System.out.println(a));
		 */
		/*
		 * List<Student> findByCiytOr = studentRepo.findByCityOrCity("Mumbai", "basti");
		 * findByCiytOr.forEach(a->System.out.println(a));
		 */

		/*
		 * List<Student> findByCity = studentRepo.findByCity("Mumbai");
		 * findByCity.forEach(a -> System.out.println(a));
		 */

		/*
		 * List<Student> allStudent = studentRepo.getAllStudent(); allStudent.forEach(a
		 * -> System.out.println(a));
		 */

		List<Student> studentByName = studentRepo.getStudentByName("Aamir khan");
		studentByName.forEach(a->System.out.println(a));
	}

}
