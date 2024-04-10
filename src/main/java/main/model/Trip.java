package main.model;

import java.time.LocalDate;

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
	private Long tripId;
	private String title;
<<<<<<< HEAD
	private List <Destination> destination;
	private List <Person> person;
	private List <CarRental> carRental;
	private List <Lodging> lodging;
	private List <Flights> flights;
=======
	private Destination destination;
	private Person person;
	private LocalDate leaveDate;
	private LocalDate returnDate;
	private CarRental carRental;
	private Lodging lodging;
	private Flights flights;
>>>>>>> 46d122cf7df47c781453d527b0723de6d9d664d2
	private int numGuests;
	private double totalPrice;
	
	
}
