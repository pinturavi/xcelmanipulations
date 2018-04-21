package com.pintu.xcelpractice;

import java.util.Date;

public class Expenses {
	private Date date;
	private String spentFor;
	private double amount;
	
	
	/**
	 * 
	getDate
	Date
	@return
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * 
	setDate
	void
	@param date
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * 
	getSpentFor
	String
	@return
	 */
	public String getSpentFor() {
		return spentFor;
	}
	/**
	 * 
	setSpentFor
	void
	@param spentFor
	 */
	public void setSpentFor(String spentFor) {
		this.spentFor = spentFor;
	}
	/**
	 * 
	getAmount
	double
	@return
	 */
	public double getAmount() {
		return amount;
	}
	public void setAmount(double d) {
		this.amount = d;
	}

}
