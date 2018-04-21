package com.pintu.dipractice.dipractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class EmployeeImpl implements Employee {
	private String name;
	
	
	public void setName(String name){
		this.name=name;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
