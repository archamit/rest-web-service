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

import com.car.insurance.web.domains.EmergencyContactData;
import com.car.insurance.web.domains.ResponseData;
import com.car.insurance.web.services.EmergencyContactDataService;

@RestController
@RequestMapping("/insurance")
public class EmergencyContactDataController {

	
	
	@Autowired
	EmergencyContactDataService emergencyContactDataService;
	
	/**
	 * @return
	 */
	@GetMapping("/emergencycontact/data")
	public  ResponseEntity<?> loadInsuranceData() {	
		return new ResponseEntity<Iterable<EmergencyContactData>>(emergencyContactDataService.fetchAll(), HttpStatus.OK);
	}
	
	@PostMapping("/emergencycontact/save")
	public  void saveData(@RequestBody EmergencyContactData emergencyContactData) {
		emergencyContactDataService.saveData(emergencyContactData);
	
	}
	
	@DeleteMapping("/emergencycontact/delete/{id}")
	public  ResponseEntity<?> deletePost(@PathVariable Long id) {		
		return new ResponseEntity<ResponseData>(emergencyContactDataService.delete(id), HttpStatus.OK);
	}
		
}
