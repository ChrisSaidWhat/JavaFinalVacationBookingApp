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
	private Destination destination;
	private Person person;
	private LocalDate leaveDate;
	private LocalDate returnDate;
	private CarRental carRental;
	private Lodging lodging;
	private Flights flights;
	private int numGuests;
	private double totalPrice;
	
	
}
