package com.pintu.dipractice.dipractice;

import org.springframework.stereotype.Component;

@Component
public class Dosa {
	
	public int price(int quantity, String flavour){
		int price;
		if(CommonConstants.CHEESE.equalsIgnoreCase(flavour)){
			price = quantity * 30;
		} else if(CommonConstants.ONION.equalsIgnoreCase(flavour)){
			price = quantity * 40;
		} else {
			price = quantity * 20;
		}
		return price;
		
	}

}
