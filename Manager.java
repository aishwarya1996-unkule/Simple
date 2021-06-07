package com.app.org;

public class Manager extends Employee {
private double perfBonus;
public Manager(int id, int deptID, String name, double basicSalary, double perfBonus) {
	super(id, deptID, name, basicSalary);
	this.perfBonus = perfBonus;
}

public String toString() {
	return "Manager [perfBonus=" + perfBonus + ", toString()=" + super.toString() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + "]";
}


public double computeNetSalary()
{
	return (basicSalary+perfBonus);
}
public double getPerfBonus() {
	return perfBonus;
}







}
