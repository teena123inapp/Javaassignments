package com.inapp.firstjava.util;

public class Employers {
	private String FirstName;
	private String LastName;
	private double EmpNumber;
	private double BasicSalary;
	private double Hra;
	private double totalsalary;
	private boolean salary;
	
	public Employers() {
		System.out.println("Constructor employers()");
	}
	
	public Employers(double basic,double hra){
		BasicSalary=basic;
		Hra=hra;
		for(int i=0;i<2;i++){
			totalsalary=BasicSalary+Hra;
			System.out.println("total salary using for loop:"+totalsalary);
		}
		int i=0;
		while(i<2)
		{
			totalsalary=BasicSalary+Hra;
			System.out.println("total salary using while loop:"+totalsalary);
	     	i++;	
		}
		int j=0;
		do{
			totalsalary=BasicSalary+Hra;
			System.out.println("total salary using do-while loop:"+totalsalary);
	     	j++;	
		}while(j<2);
		
		System.out.println("Equal evaluation:");
		salary=BasicSalary == Hra;
		
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public void setEmpNumber(double empNumber) {
		EmpNumber = empNumber;
	}
	public String getFirstName() {
		return FirstName;
	}
	public String getLastName() {
		return LastName;
	}
	public double getEmpNumber() {
		return EmpNumber;
	}
	public void setBasicSalary(double basicSalary) {
		BasicSalary = basicSalary;
		if(BasicSalary>1000)
		{
			salary = true;
		}
		else
		{
			salary = false;
		}
	}
	public void setHra(double hra) {
		Hra = hra;
	}
	public double getBasicSalary() {
		return BasicSalary;
	}
	public double getHra() {
		return Hra;
	}
	

	
}
