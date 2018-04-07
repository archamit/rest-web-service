package com.car.insurance.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.car.insurance.web.domains.EmergencyContactData;
import com.car.insurance.web.domains.ResponseData;
import com.car.insurance.web.repository.EmergencyContactDataRepository;

@Service
public class EmergencyContactDataService {

	
	@Autowired
	private EmergencyContactDataRepository emergencyContactDataRepository;
	
	public Iterable<EmergencyContactData> fetchAll() {		
		return emergencyContactDataRepository.findAll();
	}
	public void saveData(EmergencyContactData emergencyContactData) {
		emergencyContactDataRepository.save(emergencyContactData);
		
	}
	
	public ResponseData delete(Long id) {		
		EmergencyContactData emergencyContactData = new EmergencyContactData(id);
		emergencyContactDataRepository.delete(emergencyContactData);
		ResponseData responseData = new ResponseData();
		
		responseData.setResponseCode("SUCCESS");
		responseData.setResponseMessage("Successfully deleted");
		return responseData;
	}
}
