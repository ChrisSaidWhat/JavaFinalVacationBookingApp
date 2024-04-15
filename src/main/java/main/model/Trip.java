package main.model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Misti Christianson - mchristianson
 * CIS175 - Spring 2024
 * Apr 3, 2024
 */
@Entity
@Data
@NoArgsConstructor
//@AllArgsConstructor
public class Trip {
	@Id
	@GeneratedValue
	private Long tripId;
	private String title;
	@Embedded
	private Destination destination;
	@OneToMany
	private List<Person> person;
	//	these do not appear on the form - CS 04/13
//	private LocalDate leaveDate;
//	private LocalDate returnDate;
	@Embedded
	private CarRental carRental;
	@Embedded
	private Lodging lodging;
	@Embedded
	private Flights flights;
	private int numGuests;
	private double totalPrice;
	
	//setting the totalPrice-initiating the empty method for now/pull in rates from flights, lodging, carRental
	public double setTotalPrice() {
		//Flights.rate * numGuests
		double flightTotalPrice = 0;
		
		//additional for first class (+100*numGuests)?
		
		//Lodging rate per night (checkOutDate-checkInDate)
		double lodgingTotalPrice = 0;
		
		//carRental rate per day (dropOffDate-pickUpDate
		double carRentalTotalPrice = 0;
		
		totalPrice = flightTotalPrice + lodgingTotalPrice + carRentalTotalPrice;
		return totalPrice;
	}
	
	
}
