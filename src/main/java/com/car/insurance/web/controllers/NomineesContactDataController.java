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

import com.car.insurance.web.domains.NomineesContactData;
import com.car.insurance.web.domains.ResponseData;
import com.car.insurance.web.services.NomineesContactDataService;

@RestController
@RequestMapping("/insurance")
public class NomineesContactDataController {
	
	@Autowired
	NomineesContactDataService nomineesContactDataService;
	
	/**
	 * @return
	 */
	@GetMapping("/nomineescontact/data")
	public  ResponseEntity<?> loadInsuranceData() {	
		return new ResponseEntity<Iterable<NomineesContactData>>(nomineesContactDataService.fetchAll(), HttpStatus.OK);
	}
	
	@PostMapping("/nomineescontact/save")
	public  void saveData(@RequestBody NomineesContactData nomineesContactData) {
		nomineesContactDataService.saveData(nomineesContactData);
	}
	
	@DeleteMapping("/nomineescontact/delete/{id}")
	public  ResponseEntity<?> deletePost(@PathVariable Long id) {		
		return new ResponseEntity<ResponseData>(nomineesContactDataService.delete(id), HttpStatus.OK);
	}
}
