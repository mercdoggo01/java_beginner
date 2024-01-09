package com.joy.Spring_Autowiring;

public class Student {
   private Address address;
   
   
public Student(Address address)
{
	super();
	this.address =address;
}
   

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

@Override
public String toString() {
	return "Student [address=" + address + "]";
}
   
}
