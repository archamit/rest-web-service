/**
 * 
 */
package com.car.insurance.web.domains;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



/**
 * @author 
 *
 */
//@Document(collection = "CAR_INSURANCE_DATA")
@Entity
@Table(name = "CAR_INSURANCE_DATA")
public class CarInsuranceData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4837853911928739156L;
	
	
	
	public CarInsuranceData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CarInsuranceData(Long id) {
		super();
		this.id = id;
	}

	//@Id
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "INSUR_SEQ")
    @SequenceGenerator(sequenceName = "CAR_INSUR_SEQ", allocationSize = 1, name = "INSUR_SEQ")
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	
	@Column(name = "owner_name",length = 200)	
	private String ownerName;
	
	@Column(name = "car_model",length = 100)
	private String carModel;
	
	@Column(name = "car_manufacturer",length = 200)
	private String carManufacturer;
	
	@Column(name = "manufacturing_year",length = 20)
	private String manufacturingYear;
	
	@Column(name = "engine_capacity",length = 10)
	private String engineCapacity;
	
	@Column(name = "body_color",length = 50)
	private String bodyColor;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "current_insurance_valid_date", length = 19)
	private Date currentInsuranceValidTill;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "new_insurance_valid_date", length = 19)
	private Date newInsuranceDate;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the ownerName
	 */
	public String getOwnerName() {
		return ownerName;
	}

	/**
	 * @param ownerName
	 *            the ownerName to set
	 */
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	/**
	 * @return the carModel
	 */
	public String getCarModel() {
		return carModel;
	}

	/**
	 * @param carModel
	 *            the carModel to set
	 */
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	/**
	 * @return the carManufacturer
	 */
	public String getCarManufacturer() {
		return carManufacturer;
	}

	/**
	 * @param carManufacturer
	 *            the carManufacturer to set
	 */
	public void setCarManufacturer(String carManufacturer) {
		this.carManufacturer = carManufacturer;
	}

	/**
	 * @return the manufacturingYear
	 */
	public String getManufacturingYear() {
		return manufacturingYear;
	}

	/**
	 * @param manufacturingYear
	 *            the manufacturingYear to set
	 */
	public void setManufacturingYear(String manufacturingYear) {
		this.manufacturingYear = manufacturingYear;
	}

	/**
	 * @return the engineCapacity
	 */
	public String getEngineCapacity() {
		return engineCapacity;
	}

	/**
	 * @param engineCapacity
	 *            the engineCapacity to set
	 */
	public void setEngineCapacity(String engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	/**
	 * @return the bodyColor
	 */
	public String getBodyColor() {
		return bodyColor;
	}

	/**
	 * @param bodyColor
	 *            the bodyColor to set
	 */
	public void setBodyColor(String bodyColor) {
		this.bodyColor = bodyColor;
	}

	/**
	 * @return the currentInsuranceValidTill
	 */
	public Date getCurrentInsuranceValidTill() {
		return currentInsuranceValidTill;
	}

	/**
	 * @param currentInsuranceValidTill
	 *            the currentInsuranceValidTill to set
	 */
	public void setCurrentInsuranceValidTill(Date currentInsuranceValidTill) {
		this.currentInsuranceValidTill = currentInsuranceValidTill;
	}

	/**
	 * @return the newInsuranceDate
	 */
	public Date getNewInsuranceDate() {
		return newInsuranceDate;
	}

	/**
	 * @param newInsuranceDate
	 *            the newInsuranceDate to set
	 */
	public void setNewInsuranceDate(Date newInsuranceDate) {
		this.newInsuranceDate = newInsuranceDate;
	}

}
