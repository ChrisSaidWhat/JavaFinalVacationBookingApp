package main.model;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author emilylester empope1
 * CIS 175 Spring 2024
 * Apr 3, 2024
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Person {
	
	//Attributes
	@Id
	@GeneratedValue
	private int guestId;
	private String firstName;
	private String lastName;
	private LocalDate birthday;
	private String email;
	private String address;
	private String city;
	private String state;
	private String zip;
	private int phoneNo;
	@ManyToOne
	private Trip trip;

}
