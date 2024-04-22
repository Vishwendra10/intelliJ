package com.vish.realstate.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Realstate {
	
	@Id
	private int propertyid;
	private String city;
	private String society;

}
