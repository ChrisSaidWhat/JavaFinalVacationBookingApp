package main.model;

import java.util.List;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author christophersaid - csaid
 * CIS175 - Spring 2024
 * Apr 4, 2024
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Destination {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long destinationId;
	private String destinationName;
	private String destinationType;
	private String destinationCity;
	private String destinationState;
	private String destinationCountry;
	@OneToMany
	private List<Trip> trips;
	
}
