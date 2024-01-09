package com.joy.collection;

import java.util.*;

public class Student {

	private String name;
	private List<String> address;
	private Set<String> phnno;
	private Map<String,String> courses;
	
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", phnno=" + phnno + ", courses=" + courses + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public Set<String> getPhnno() {
		return phnno;
	}
	public void setPhnno(Set<String> phnno) {
		this.phnno = phnno;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

}
