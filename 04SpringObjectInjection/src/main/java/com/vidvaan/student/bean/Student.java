package com.vidvaan.student.bean;

//dependent
public class Student {
	// dependencies
	private int sid;
	private String name;
	private Address address;
	public Student() {
		
	}

	public Student(int sid, String name, Address address) {
		System.out.println("parameter constructor");
		this.sid = sid;
		this.name = name;
		this.address = address;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", address=" + address + "]";
	}

}
