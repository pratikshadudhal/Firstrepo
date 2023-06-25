package com.example.microservices.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.microservices.user.entity.Employee;
import com.example.microservices.user.repository.EmpRepository;

@Service
public class EmpService {
@Autowired
	private EmpRepository empRepository;
	
	
	public List<Employee> getAllEmp(Employee emp) {
		return (List<Employee>) empRepository.findAll();
	}


	public Employee getEmpById(Long id) {
		return empRepository.findById(id).get();
	}


	public Employee saveEmp(Employee emp) {
		return empRepository.save(emp);
	}


	


	public void deleteEmpById(Long id) {
		// TODO Auto-generated method stub
		empRepository.deleteById(id);
	}


	public Employee updateEmp(Employee emp) {
		return empRepository.save(emp);
		
	}
	

}
