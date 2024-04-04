package main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author christophersaid - csaid
 * CIS175 - Spring 2024
 * Apr 2, 2024
 */

@Repository
public interface TravelRepository extends JpaRepository <Trip, Long> {

}
