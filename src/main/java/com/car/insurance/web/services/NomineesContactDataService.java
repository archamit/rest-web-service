package com.car.insurance.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.car.insurance.web.domains.NomineesContactData;
import com.car.insurance.web.domains.ResponseData;
import com.car.insurance.web.repository.NomineesContactDataRepository;

@Service
public class NomineesContactDataService {

	@Autowired
	private NomineesContactDataRepository nomineesContactDataRepository;
	
	public Iterable<NomineesContactData> fetchAll() {		
		return nomineesContactDataRepository.findAll();
	}
	public void saveData(NomineesContactData nomineesContactData) {
		nomineesContactDataRepository.save(nomineesContactData);
		
	}
	
	public ResponseData delete(Long id) {		
		NomineesContactData nomineesContactData = new NomineesContactData(id);
		nomineesContactDataRepository.delete(nomineesContactData);
		ResponseData responseData = new ResponseData();
		responseData.setResponseCode("SUCCESS");
		responseData.setResponseMessage("Successfully deleted");
		return responseData;
	}
}
