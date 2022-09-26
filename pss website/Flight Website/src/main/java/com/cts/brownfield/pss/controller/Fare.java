package com.cts.brownfield.pss.controller;

public class Fare {
	private long fareId;
	private double ticketFare;
	private  String currency;

	public Fare(double ticketFare, String currency) {
		super();
		this.ticketFare = ticketFare;
		this.currency = currency;
	}

	public Fare() {
		super();
	}

	
	

	public long getFareId() {
		return fareId;
	}

	public void setFareId(long fareId) {
		this.fareId = fareId;
	}

	public double getTicketFare() {
		return ticketFare;
	}

	public void setTicketFare(double ticketFare) {
		this.ticketFare = ticketFare;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Override
	public String toString() {
		return "Fare [id=" + fareId + ", fare=" + ticketFare + ", currency=" + currency + "]";
	}

}
