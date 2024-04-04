package main.model;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
@AllArgsConstructor
public class Trip {
	@Id
	@GeneratedValue
	private int tripId;
	private String title;
	private List <Destination> destination;
	private List <Person> person;
	private List <CarRental> carRental;
	private List <Lodging> lodging;
	private List <Flights> flights;
	private int numGuests;
	private double totalPrice;

	
}
