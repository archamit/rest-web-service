package com.car.insurance.web.domains;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name = "EMERGENCY_CONTACT_DATA")
public class EmergencyContactData implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 722673050182799192L;
	/**
	 * 
	 */
	public EmergencyContactData() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 */
	public EmergencyContactData(Long id) {
		super();
		this.id = id;
	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EMG_SEQ")
    @SequenceGenerator(sequenceName = "EMG_INSUR_SEQ", allocationSize = 1, name = "EMG_SEQ")
	@Column(name = "id", unique = true, nullable = false)
	
	private Long id;
	@Column(name = "first_Name",length = 200)	
	private String firstName;
	
	@Column(name = "last_Name",length = 100)
	private String lastName;
	
	@Column(name = "phone_No",length = 200)
	private String phoneNo;
	
	@Column(name = "address",length = 20)
	private String address;
	
	@Column(name = "zip",length = 10)
	private String zip;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
	
	
}
