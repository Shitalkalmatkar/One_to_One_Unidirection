package com.jsp.Person_Pan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Pan {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
 private int id;
 private String name;
 
 
 
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
 

}
