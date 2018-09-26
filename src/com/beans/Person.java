package com.beans;

public class Person {
	
	private String name;
	private String surname;
	private short age;
	private String country;
	
	
	
	
	public Person(String name, String surname, short age, String country) {
		super();
		if((name==null)||(surname==null)) throw new IllegalArgumentException("Name or surname can't be null");
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.country = country;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public short getAge() {
		return age;
	}
	public void setAge(short age) {
		this.age = age;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	
	

}
