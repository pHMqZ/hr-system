package com.pms.payrollapi.entity;


public class Payroll {
	
	private String workerName;
	private String description;
	private Double priceHour;
	private Double workedHours;
	private Double totalPayment;
	
	public Payroll(String workerName, String description, Double priceHour, Double workedHours) {
		this.workerName = workerName;
		this.description = description;
		this.priceHour = priceHour;
		this.workedHours = workedHours;
	}

	public String getWorkerName() {
		return workerName;
	}

	public void setWorkerName(String workerName) {
		this.workerName = workerName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPriceHour() {
		return priceHour;
	}

	public void setPriceHour(Double priceHour) {
		this.priceHour = priceHour;
	}

	public Double getWorkedHours() {
		return workedHours;
	}

	public void setWorkedHours(Double workedHours) {
		this.workedHours = workedHours;
	}

	public Double getTotalPayment() {
		return totalPayment;
	}

	public void setTotalPayment(Double totalPayment) {
		this.totalPayment = totalPayment;
	}
	
}
