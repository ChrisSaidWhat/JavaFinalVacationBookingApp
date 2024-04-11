package main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import main.model.Trip;

/**
 * @author christophersaid - csaid
 * CIS175 - Spring 2024
 * Apr 2, 2024
 */

@Repository
public interface TravelRepository extends JpaRepository <Trip, Long> {

	/**
	 * @param destination
	 * @return
	 */
	List<Trip> findByDestination(String destination);

}
