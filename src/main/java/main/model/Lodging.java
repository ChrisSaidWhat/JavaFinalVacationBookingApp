package main.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Misti Christianson - mchristianson
 * CIS175 - Spring 2024
 * Apr 10, 2024
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Lodging {
	@Id
	@GeneratedValue
	private int lodgingId;
	private String lodgingName;
	private LocalDate checkInDate;
	private LocalDate checkOutDate;
	private String lodgingType;
	private int maxCapacity;
	private String address;
	private String city;
	private String state;
	private String zip;
	private double rate;
}
