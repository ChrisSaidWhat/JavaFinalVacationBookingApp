package main.model;

import java.time.LocalDateTime;
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

/**
 * @author christophersaid - csaid
 * CIS175 - Spring 2024
 * Apr 2, 2024
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Flights {

	//	fields
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int flightId;
	private String airline;
	private LocalDateTime departure;
	private LocalDateTime arrival;
	private String frequentFlyerNo;
	private int numSeats;
	private String seatingClass;
	private double rate;
	@OneToMany
	private List<Trip> trips;
}
