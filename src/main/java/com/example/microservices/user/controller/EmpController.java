package com.example.microservices.user.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservices.user.entity.Employee;
import com.example.microservices.user.service.EmpService;

@RestController
public class EmpController {
	@Autowired
	EmpService empService;
   
	@GetMapping("/getall")
	 public ResponseEntity<List<Employee>> getAllEmp(@RequestBody Employee emp)
	 {
	 List<Employee> allEmp = empService.getAllEmp(emp);
	 return new ResponseEntity<List<Employee>>(allEmp,HttpStatus.OK);
			
	 }
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Employee> getEmpById(@PathVariable ("id")Long id)
	{
	Employee empById = empService.getEmpById(id);
	return new ResponseEntity<Employee>(empById,HttpStatus.OK);
		
		
	}
	
	@PostMapping("/save")
	public ResponseEntity<Employee> saveEmp(@RequestBody Employee emp)
	{
		Employee saveEmp = empService.saveEmp(emp);
		return new ResponseEntity<Employee>(saveEmp,HttpStatus.CREATED);
		
	}
	
	
	@PutMapping("/update")
	public ResponseEntity<Employee> updateEmp(@RequestBody Employee emp)
	{
		Employee updateEmp1 = empService.updateEmp(emp);
		return new ResponseEntity<Employee> (updateEmp1,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Employee>  deleteEmpById(@PathVariable("id") Long id)
	{ 
		empService.deleteEmpById(id);
		return new ResponseEntity<Employee>(HttpStatus.ACCEPTED);
	}
}
