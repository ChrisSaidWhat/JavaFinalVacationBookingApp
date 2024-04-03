package main.model;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
public class Trip {
	@Id
	@GeneratedValue
	int tripId;
	String title;
	List <Destination> destination;
	List <Person> person;
	List <CarRental> carRental;
	List <Lodging> lodging;
	List <Flights> flights;
	int numGuests;
	double totalPrice;

	public Trip(String title, List<Destination> destination, int numGuests) {
		super();
		this.title = title;
		this.destination = destination;
		this.numGuests = numGuests;
	}
	
	public Trip(String title, List<Destination> destination) {
		super();
		this.title = title;
		this.destination = destination;
	}
	
	public Trip(String title, int numGuests) {
		super();
		this.title = title;
		this.numGuests = numGuests;
	}
	
	public Trip(String title) {
		super();
		this.title = title;
	}
	
	
	
	
}
