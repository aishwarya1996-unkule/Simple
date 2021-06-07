package com.app.org;
public class Employee {
private int id,deptID;
private String name;
double basicSalary;
public Employee(int id, int deptID, String name, double basicSalary) {
	super();
	id = this.id;
	this.deptID = deptID;
	this.name = name;
	this.basicSalary = basicSalary;
}

 
@Override
public String toString() {
	return "Employee [ID=" + id + ", deptID=" + deptID + ", name=" + name + ", basicSalary=" + basicSalary + "]";
}

public double computeNetSalary() {
	return 0;
}

}
