package com.beans;

public class Employee extends Person{
	
	private String jobTitle;
	private double salary;
	
	
	public Employee(String name, String surname, short age, String country){
		
		super(name, surname, age,country);
		
	}


	public String getJobTitle() {
		return jobTitle;
	}


	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
	

	 @Override
	public String toString() {
		 
		return "Employee [jobTitle=" + jobTitle + ", salary=" + salary
				+ ", getName()=" + getName() + ", getSurname()=" + getSurname()
				+ ", getAge()=" + getAge() + ", getCountry()=" + getCountry()
				+ "]";
	}
	
	

}
