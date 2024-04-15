package main.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/*
 * Maya Cruz - Gcruz
 * CIS175 - Spring 2024
 * Apr 4, 2024
 */
@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Lodging {
	
	//	needed to make the fields have unique names for an embedded class - CS 04/13
	private int lodgingId;
	private LocalDate checkInDate;
	private LocalDate checkOutDate;
	private String lodgingName;
	private String lodgingType;
	private double lodgingRate;
	private int maxCapacity;
	private String lodgingAddress;
	private String lodgingCity;
	private String lodgingState;
	private String lodgingZip;
	private String lodgingCountry;
	private String lodgingRewardsNo;
//	@OneToMany
//	private List<Trip> tripLodging;


}
