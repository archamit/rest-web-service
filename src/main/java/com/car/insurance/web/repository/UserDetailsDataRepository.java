package com.car.insurance.web.repository;

import org.springframework.data.repository.CrudRepository;

import com.car.insurance.web.domains.UserDetailsData;

public interface UserDetailsDataRepository extends CrudRepository<UserDetailsData, String>{

}
