package main.model;

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
 * Apr 4, 2024
 */

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Destination {

	private int destinationId;
	private String destinationName;
	private String destinationType;
	private String destinationCity;
	private String destinationState;
	private String destinationCountry;
//	@OneToMany
//	private List<Trip> trips;
	
}
