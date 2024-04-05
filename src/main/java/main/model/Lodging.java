package main.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Maya Cruz - Gcruz
 * CIS175 - Spring 2024
 * Apr 4, 2024
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Lodging {
	
	@Id
	@GeneratedValue
	private int lodgingId;
	private LocalDate startDate;
	private LocalDate endDate;
	private String name;
	private String type;
	private double rate;
	private int maxCapacity;
	private String address;
	private String city;
	private String state;
	private String zip;

}
