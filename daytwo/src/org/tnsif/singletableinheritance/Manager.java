package org.tnsif.singletableinheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

//CHILD CLASS
@Entity
@DiscriminatorValue("MNG")
public class Manager extends Employee{

	
	private String deptName;

	//getters and setters
	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	
}
