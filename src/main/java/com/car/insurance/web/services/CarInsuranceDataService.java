/**
 * 
 */
package com.car.insurance.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.car.insurance.web.domains.CarInsuranceData;
import com.car.insurance.web.domains.ResponseData;
import com.car.insurance.web.repository.CarInsuranceDataRepository;

/**
 * @author 
 *
 */
@Service
public class CarInsuranceDataService {

	@Autowired
	private CarInsuranceDataRepository carInsuranceDataRepository;
	
	
	public Iterable<CarInsuranceData> fetchAll() {		
		return carInsuranceDataRepository.findAll();
	}
	public void saveData(CarInsuranceData carInsuranceData) {
		carInsuranceDataRepository.save(carInsuranceData);
		
	}
	
	public ResponseData delete(Long id) {		
		CarInsuranceData carInsuranceData = new CarInsuranceData(id);
		carInsuranceDataRepository.delete(carInsuranceData);
		ResponseData responseData = new ResponseData();
		
		responseData.setResponseCode("SUCCESS");
		responseData.setResponseMessage("Successfully deleted");
		return responseData;
	}

	
}
