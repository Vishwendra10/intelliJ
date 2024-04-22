package com.test.embedded.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name= "emplist")
@Getter
@Setter
@NoArgsConstructor
public class EmployeeList {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int fid;
	
	private float value;
	

}
