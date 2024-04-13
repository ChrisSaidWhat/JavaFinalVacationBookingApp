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

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Destination {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int destinationId;
	private String name;
	private String type;
	private String city;
	private String state;
	private String country;
	@OneToMany
	private List<Trip> trips;
	
}
