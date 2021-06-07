package com.app.org;

public class Worker extends Employee {
	private int workedHours,hourlyRate;	
	public Worker(int id, int deptID, String name, double basicSalary, int workedHours, int hourlyRate) {
		super(id, deptID, name, basicSalary);
		this.workedHours = workedHours;
		this.hourlyRate = hourlyRate;
	}
	
	

	@Override
	public String toString() {
		return "Worker [workedHours=" + workedHours + ", hourlyRate=" + hourlyRate + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}



	public double computeNetSalary()
	{
		return basicSalary+(workedHours*hourlyRate) ;
	}
	public int getHourlyRate() {
		return hourlyRate;
	}
	
	

}
