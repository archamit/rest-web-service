package com.car.insurance;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

import com.car.insurance.web.domains.CarInsuranceData;
import com.car.insurance.web.repository.CarInsuranceDataRepository;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableConfigurationProperties()
//public class Application {
public class Application implements CommandLineRunner {

	@Autowired
	private CarInsuranceDataRepository carInsuranceDataRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	private void dataBuilder() {

		carInsuranceDataRepository.deleteAll();		
		
		CarInsuranceData carInsuranceData = new CarInsuranceData();
		
		carInsuranceData.setBodyColor("cherry red");
		carInsuranceData.setCarManufacturer("Toyota");
		carInsuranceData.setCarModel("Camry");
		carInsuranceData.setCurrentInsuranceValidTill(new Date());
		carInsuranceData.setEngineCapacity("1800 cc");
		carInsuranceData.setManufacturingYear("2010");
		carInsuranceData.setNewInsuranceDate(new Date());
		carInsuranceData.setOwnerName("Amit Saini");
		
		carInsuranceDataRepository.save(carInsuranceData);		
	}

	@Override
	public void run(String... args) throws Exception {

		dataBuilder();
	}
}