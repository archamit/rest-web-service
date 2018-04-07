package com.car.insurance.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.car.insurance.web.domains.ResponseData;
import com.car.insurance.web.domains.UserDetailsData;
import com.car.insurance.web.repository.UserDetailsDataRepository;

@Service
public class UserDetailsDataService {

	@Autowired
	private UserDetailsDataRepository userDetailsDataRepository;
	
	public Iterable<UserDetailsData> fetchAll() {		
		return userDetailsDataRepository.findAll();
	}
	public void saveData(UserDetailsData userDetailsData) {
		userDetailsDataRepository.save(userDetailsData);
		
	}
	
	public ResponseData delete(Long id) {		
		UserDetailsData userDetailsData = new UserDetailsData(id);
		userDetailsDataRepository.delete(userDetailsData);
		ResponseData responseData = new ResponseData();
		responseData.setResponseCode("SUCCESS");
		responseData.setResponseMessage("Successfully deleted");
		return responseData;
	}
	
	/*
	public UserDetailsData getUser(String id) {		
		return userDetailsDataRepository.findOne(id);
	}
	*/
}
