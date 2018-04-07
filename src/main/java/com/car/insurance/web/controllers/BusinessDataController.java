/**
 * 
 */
package com.car.insurance.web.controllers;

import java.util.Date;

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

import com.car.insurance.web.domains.CarInsuranceData;
import com.car.insurance.web.domains.ResponseData;
import com.car.insurance.web.services.CarInsuranceDataService;

/**
 * @author 
 *
 */
@RestController
@RequestMapping("/insurance")
public class BusinessDataController {
	
	@Autowired
	CarInsuranceDataService carInsuranceDataService;
	
	/**
	 * @return
	 */
	@GetMapping("/car/data")
	public  ResponseEntity<?> loadInsuranceData() {	
		return new ResponseEntity<Iterable<CarInsuranceData>>(carInsuranceDataService.fetchAll(), HttpStatus.OK);
	}
	
	@PostMapping("/car/save")
	public  void saveData(@RequestBody CarInsuranceData carInsuranceData) {
		carInsuranceData.setNewInsuranceDate(new Date());
		carInsuranceData.setCurrentInsuranceValidTill(new Date());
		carInsuranceDataService.saveData(carInsuranceData);
	}
	
	@DeleteMapping("/car/delete/{id}")
	public  ResponseEntity<?> deletePost(@PathVariable Long id) {		
		return new ResponseEntity<ResponseData>(carInsuranceDataService.delete(id), HttpStatus.OK);
	}
		
}
