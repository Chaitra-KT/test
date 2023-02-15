package Dto;

import java.sql.Date;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
@Entity
@Data
public class student {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
int id;
String name;
@Column(unique=true)
String email;
@Column(unique=true)
long mobile;
String Password;
String Standard;
Date dob;
int age;

@OneToMany
List<Markscard >markscard;

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

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public long getMobile() {
	return mobile;
}

public void setMobile(long mobile) {
	this.mobile = mobile;
}

public String getPassword() {
	return Password;
}

public void setPassword(String password) {
	Password = password;
}

public String getStandard() {
	return Standard;
}

public void setStandard(String standard) {
	Standard = standard;
}

public Date getDob() {
	return dob;
}

public void setDob(Date dob) {
	this.dob = dob;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public List<Markscard> getMarkscard() {
	return markscard;
}

public void setMarkscard(List<Markscard> markscard) {
	this.markscard = markscard;
}
}
