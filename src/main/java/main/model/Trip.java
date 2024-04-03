package main.model;


import java.util.List;

import javax.print.attribute.standard.Destination;

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
	Long tripId;
	String title;
	List <Destination> destination;
	List <Person> person;
	List <CarRental> carRental;
//	List <Lodging> lodging;
	List <Flights> flights;
	int numGuests;
	double totalPrice;

	
}
