package com.test.embedded.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.test.embedded.model.Employee;


public interface TestRepository extends JpaRepository<Employee, Integer>{

}
