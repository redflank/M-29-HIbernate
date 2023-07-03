package org.tnsif.joinedtableinheritance;

import javax.persistence.Entity;
import javax.persistence.Table;
//child class
@Entity
@Table(name="Car")
public class Car {

	
	private String brandName;

	//getters and setters
	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	
}
