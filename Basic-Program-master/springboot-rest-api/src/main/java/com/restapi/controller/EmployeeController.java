package com.restapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.model.Employee;
import com.restapi.tempservice.TempService;

/*
here RestController is use for the restapi
and if we are using restcontroller then we do not need to @responsebody*/

@RestController
public class EmployeeController {

	@Autowired
	private TempService tempService;

	// @RequestMapping(value = "/books", method = RequestMethod.GET)
	/*
	 * it is a combination of method=RequestMethod.GET if we write get mapping then
	 * we do not need like method=RequestMethod.GET
	 */
	/*
	 * @ResponseBody // response body is use for when i want to return as string on
	 * browser then use // this
	 */

	@GetMapping("/")
	public Employee getEmployee() {
		Employee employee = new Employee();
		employee.setId(101);
		employee.setName("Sarfraz khan");
		employee.setAddress("saki naka ");
		employee.setcity("Mumbai");
		return employee;
		/*
		 * this is not JSON here spring boot automatically convert employee object into
		 * JSON because jackson already exists in spring boot then jackson covert into
		 * JSON
		 */

	}

	/*
	 * ResponseEntity is a class represents the whole HTTP response: status code,
	 * headers, and body. As a result, we can use it to fully configure the HTTP
	 * response. suppose that we don't have any data when i get all data then we can
	 * see in postman 200 OK but here will not be any data so we can send data status
	 * like NOT_FOUND in postman
	 * 
	 * here build() for making proper object
	 */
	@GetMapping("/employee")
	public ResponseEntity<List<Employee>> getAllRecord() {
		List<Employee> list = tempService.getAllData();
		if (list.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(list));

	}

	/*
	 * @PathVariable It is use for handle the template variable in the URI mapping.
	 */

	/*
	 * here Exception will be occurs we have to use try catch in TempService Class
	 * in method of getById
	 */
	@GetMapping("/findbyId/{id}")
	public ResponseEntity<Employee> getID(@PathVariable("id") Integer id) {
		Employee byID = tempService.getByID(id);
		if (byID == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(byID));

	}

	/*
	 * @RequestBody annotation maps the HttpRequest body to a transfer or domain
	 * object, enabling automatic deserialization of the inbounds HttpRequest body
	 * onto a Java object.
	 */

	/*
	 * here is the @RequestBody is use for transfer for domain when client add any
	 * value that value will be in key and value pair and hit controller
	 * then @RequestBody is injected that values inside the bean that's it
	 */
	@PostMapping("/employee")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee e) {
		// Employee emp = null;
		try {
			Employee emp = tempService.addDetails(e);
			return ResponseEntity.status(HttpStatus.CREATED).build();
		} catch (Exception e2) {
			e2.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteEmployee(@PathVariable("id") Integer id) {
		try {
			this.tempService.deleteById(id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Employee> updatEmployee(@RequestBody Employee emp, @PathVariable("id") Integer id) {
		try {
			this.tempService.updateById(emp, id);
			return ResponseEntity.of(Optional.of(emp));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

}
