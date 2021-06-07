package com.app.org;
import java.util.Scanner;
public class TestOrganisation {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee[] e=new Employee[3];
Scanner sc=new Scanner(System.in);
boolean flag=true;
while(flag!=false)
{
System.out.println("1. Hire Manager");
System.out.println("2. Hire Worker ");
System.out.println("3. Display information of all employees & display net salary");
System.out.println("Exit");
System.out.println("Enter your choice");
int ch=sc.nextInt();
switch(ch)
{
case 1:
	System.out.println("Enter id, departID,name,basic salary,performance bonus");
	int id=sc.nextInt();
	int deptID=sc.nextInt();
	String name=sc.next();
	Double basicSalary=sc.nextDouble();
	Double perfBonus=sc.nextDouble();
	Manager m=new Manager(id,deptID,name,basicSalary,perfBonus);
	e[0]=m;
	System.out.println(m.getPerfBonus());
	System.out.println(m.computeNetSalary());
	break;
case 2:
	System.out.println("Enter ID,Department ID,name,basicSalary,Worked Hours,Hourly Rate");
	id=sc.nextInt();
	deptID=sc.nextInt();
	name=sc.next();
	basicSalary=sc.nextDouble();
	int workedHours=sc.nextInt();
	int hourlyRate=sc.nextInt();
	Worker w=new Worker(id,deptID,name,basicSalary,workedHours,hourlyRate);
	e[1]=w;
	System.out.println(w.computeNetSalary());
	break;
case 3:
	System.out.println("Information Displayed");
	for(Employee i:e)
	{
		System.out.println(i);
	}
	
	
	break;
case 4:
	System.out.println("Exit");
	flag=false;
	break;
}
}

	}

}
