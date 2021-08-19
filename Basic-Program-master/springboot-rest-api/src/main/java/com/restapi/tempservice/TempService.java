package com.restapi.tempservice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.restapi.model.Employee;

@Component
public class TempService {
	private static List<Employee> list = new ArrayList<>();
	static {

		list.add(new Employee(1, "aamir khan", "mumbai", "sakinaka"));
		list.add(new Employee(2, "arman khan", "gao", "balaipur"));
		list.add(new Employee(3, "salman khan", "delhi", "govind"));
		list.add(new Employee(4, "furqan khan", "lucknow", "gomtinager"));

	}

	// get all details
	public List<Employee> getAllData() {
		return list;
	}

	// get details by id
	public Employee getByID(Integer id) {
		Employee employee = null;
		try {
			employee = list.stream().filter(a -> a.getId() == id).findFirst().get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return employee;

	}
	// add details

	public Employee addDetails(Employee employee) {
		
		list.add(employee);
		return employee;
	}

	public void deleteById(Integer id) {

		/*
		 * We can also write like that here every id come to in e and check if id not
		 * match then add in the list id if match then remove from the list
		 */
		/*
		 * list.stream().filter(e->{ if(e.getId()!=id) { return true; }else{ return
		 * false; } }).collect(Collectors.toList());
		 */
		list = list.stream().filter(z -> z.getId() != id).collect(Collectors.toList());

	}

	// update by id
	public void updateById(Employee emp, Integer id) {
		list = list.stream().map(q -> {
			if (q.getId() == id) {
				q.setName(emp.getName());
				q.setAddress(emp.getAddress());
				q.setcity(emp.getcity());
			}
			return q;
		}).collect(Collectors.toList());

	}

}
