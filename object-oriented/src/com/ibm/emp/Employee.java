package com.ibm.emp;
public class Employee {
	private int empNo;
	private String empName;
	private double salary;
	private static int count=101;
	
	public Employee() {
		
	}
	public Employee( String empName,double salary) {
		this.empNo = count++;
		this.empName= empName;
		this.salary = salary;
		
	}
	public double getSalary() {
		return salary;
	}
	public void payslip() {
		System.out.println("Emp No\t\t:"+empNo);
		System.out.println("Emp Name\t:"+empName);
		System.out.println("Salary\t\t:"+ salary);
	}
}