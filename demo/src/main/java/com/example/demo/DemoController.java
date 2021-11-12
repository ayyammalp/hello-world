package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.repository.IEmployeeInfo;

@RestController
@RequestMapping(path = "/v1")
public class DemoController {
	
	@Autowired
	IEmployeeInfo employeeInfo;
	
	@GetMapping(path = "/hello", produces = "application/json")
	public @ResponseBody String getAuthServiceStatus() {
		return "Hello World";
	}
	
	@GetMapping(path = "/employees", produces = "application/json")
	public @ResponseBody List<Employee> getAllEmployee() {
		return employeeInfo.getAllEmployee();
	}
	
	 @GetMapping(path="/employees/{employeeid}", produces = "application/json")
	    public @ResponseBody Employee getEdgeServicesPort(@PathVariable String employeeid)  
	    {
		 return employeeInfo.getEmployeebyId(employeeid);
	    }
	    

}
