package com.vish.realstate.controller;

import java.net.http.HttpHeaders;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vish.realstate.model.Realstate;
import com.vish.realstate.service.RealstateService;

@RestController
@RequestMapping("/v1")
public class RealstateController {
	
	@Autowired
	private RealstateService realstate;
	
	@GetMapping("/getproperty")
	public ResponseEntity<List<Realstate>> getMethod()
	{
		List<Realstate> list1= this.realstate.getAllDetails();
		return new ResponseEntity<List<Realstate>>(list1 , HttpStatus.OK);
	}
	
	@PutMapping("/putproperty")
	public ResponseEntity<Realstate> putMethod(@RequestBody Realstate data)
	{
		Realstate updatedData= this.realstate.putDetails(data);
		return new ResponseEntity<Realstate>(updatedData,HttpStatus.CREATED);
	}
	@PatchMapping("/patchproperty/{id}")
	public ResponseEntity<Realstate> patchMethod(@PathVariable(name="id")int id,@RequestBody Map<String, Object> data)
	{
		Realstate updatedData= this.realstate.patchDetails(id,data);
		return new ResponseEntity<Realstate>(updatedData,HttpStatus.CREATED);
	}
	

}
