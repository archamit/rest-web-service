package com.car.insurance.web.repository;

import org.springframework.data.repository.CrudRepository;

import com.car.insurance.web.domains.EmergencyContactData;

public interface EmergencyContactDataRepository extends CrudRepository<EmergencyContactData, String>{

}
