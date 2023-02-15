package Dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class Markscard {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String standard;
	double science;
	double maths;
	double English;
	double percentage;
	String Result;
	
}
