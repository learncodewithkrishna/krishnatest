package com.testmvc1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
@Id
//primary key
private int id;
private String name;
private String add;
private String contact;
public Student(int id, String name, String add, String contact) {
	super();
	this.id = id;
	this.name = name;
	this.add = add;
	this.contact = contact;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAdd() {
	return add;
}
public void setAdd(String add) {
	this.add = add;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", add=" + add + ", contact=" + contact + "]";
}
	
	
	
}
