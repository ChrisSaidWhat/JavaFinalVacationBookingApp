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
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Lodging {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int lodgingId;
	private LocalDate checkInDate;
	private LocalDate checkOutDate;
	private String name;
	private String type;
	private double rate;
	private int maxCapacity;
	private String address;
	private String city;
	private String state;
	private String zip;
	@OneToMany
	private List<Trip> trip;


}
