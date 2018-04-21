package com.pintu.dipractice.dipractice;

import org.springframework.stereotype.Component;

@Component
public class ManagerImpl implements Employee {
	private String name;
	
	public void setName(String name){
		this.name = name;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return "I am a manager";
	}

}
