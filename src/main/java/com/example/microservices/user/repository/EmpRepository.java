package com.example.microservices.user.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.microservices.user.entity.Employee;

public interface EmpRepository extends CrudRepository<Employee, Long>{

	

}
