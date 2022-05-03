package com.component.model;

public class Employee {
public int empId;
public String name;
public String address1;
public String address2;
public String city;
public String department;
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress1() {
	return address1;
}
public void setAddress1(String address1) {
	this.address1 = address1;
}
public String getAddress2() {
	return address2;
}
public void setAddress2(String address2) {
	this.address2 = address2;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}

@Override
public String toString() {
	return " {empId=" + empId + ", name=" + name + ", address1=" + address1 + ", address2=" + address2
			+ ", city=" + city + ", department=" + department + "}";
}



}
