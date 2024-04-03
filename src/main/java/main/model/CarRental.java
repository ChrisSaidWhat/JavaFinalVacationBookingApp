package main.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author christophersaid - csaid
 * CIS175 - Spring 2024
 * Apr 2, 2024
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarRental {
	
	//	fields
	@Id
	@GeneratedValue
	private int rentalId;
	private LocalDate pickUpDate;
	private LocalDate dropOffDate;
	private String model;
	private double rate;
}
