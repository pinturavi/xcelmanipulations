package com.pintu.dipractice.dipractice;

import org.springframework.stereotype.Component;

@Component
public class Pizza {
	/*int noOfTopping;
	String typeOfTopping;
	int Quantity;
	public Pizza(int noOfTopping, String typeOfTopping,int Quantity){
		this.noOfTopping = noOfTopping;
		this.typeOfTopping = typeOfTopping;
		this.Quantity = Quantity;
	}*/
	
	public int price(int noOfTopping, String typeOfTopping,int quantity){
		int price = 0;
		int priceOfNoOfTopping = noOfTopping * 12;
		int priceOfTypeOfTopping = 10;
		if(CommonConstants.RED_COLOR.equalsIgnoreCase(typeOfTopping)){
			priceOfTypeOfTopping=20;
		}
		price = (priceOfNoOfTopping + priceOfTypeOfTopping)*quantity;
		
		return price;
	}

}
