package com.entity;

public class Registration {
 private int e_id;
 private String name;
 private String dept;
 private int age;
 private long mobino;
 private float salary;
 private String email;
 
 private Login log;

public int getE_id() {
	return e_id;
}

public void setE_id(int e_id) {
	this.e_id = e_id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDept() {
	return dept;
}

public void setDept(String dept) {
	this.dept = dept;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public long getMobino() {
	return mobino;
}

public void setMobino(long mobino) {
	this.mobino = mobino;
}

public float getSalary() {
	return salary;
}

public void setSalary(float salary) {
	this.salary = salary;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public Login getLog() {
	return log;
}

public void setLog(Login log) {
	this.log = log;
}

public Registration() {
	
}

public Registration(int e_id, String name, String dept, int age, long mobino, float salary, String email, Login log) {
	super();
	this.e_id = e_id;
	this.name = name;
	this.dept = dept;
	this.age = age;
	this.mobino = mobino;
	this.salary = salary;
	this.email = email;
	this.log = log;
}

@Override
public String toString() {
	return "Registration [e_id=" + e_id + ", name=" + name + ", dept=" + dept + ", age=" + age + ", mobino=" + mobino
			+ ", salary=" + salary + ", email=" + email + ", log=" + log + "]";
}

 
 
}
