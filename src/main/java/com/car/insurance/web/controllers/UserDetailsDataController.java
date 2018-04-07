package com.car.insurance.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.car.insurance.web.domains.ResponseData;
import com.car.insurance.web.domains.UserDetailsData;
import com.car.insurance.web.services.UserDetailsDataService;

@RestController
@RequestMapping("/insurance")
public class UserDetailsDataController {
	
	@Autowired
	UserDetailsDataService userDetailsDataService;
	
	/**
	 * @return
	 */
	@GetMapping("/userdetails/data")
	public  ResponseEntity<?> loadInsuranceData() {	
		return new ResponseEntity<Iterable<UserDetailsData>>(userDetailsDataService.fetchAll(), HttpStatus.OK);
	}
	
	@DeleteMapping("/userdetails/delete/{id}")
	public  ResponseEntity<?> deletePost(@PathVariable Long id) {		
		return new ResponseEntity<ResponseData>(userDetailsDataService.delete(id), HttpStatus.OK);
	}
	
	@PostMapping("/userdetails/save")
	public  void saveData(@RequestBody UserDetailsData userDetailsData) {
		userDetailsDataService.saveData(userDetailsData);
	}
}
