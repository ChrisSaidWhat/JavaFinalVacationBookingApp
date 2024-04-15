package main.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author christophersaid - csaid
 * CIS175 - Spring 2024
 * Apr 2, 2024
 */
@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarRental {
	
	//	fields
	private int rentalId;
	private LocalDate pickUpDate;
	private LocalDate dropOffDate;
	private String model;
	private double carRentalRate;
//	@OneToMany
//	private List<Trip> trips;
}
