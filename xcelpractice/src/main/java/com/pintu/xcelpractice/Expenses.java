package com.pintu.xcelpractice;

import java.time.LocalDate;
import java.util.Date;

public class Expenses {
	private Date date;
	private String spentFor;
	private double amount;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getSpentFor() {
		return spentFor;
	}
	public void setSpentFor(String spentFor) {
		this.spentFor = spentFor;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double d) {
		this.amount = d;
	}

}