package com.car.insurance.web.repository;

import org.springframework.data.repository.CrudRepository;

import com.car.insurance.web.domains.CarInsuranceData;

public interface CarInsuranceDataRepository extends CrudRepository<CarInsuranceData, String> {	

}