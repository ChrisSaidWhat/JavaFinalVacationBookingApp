package main.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import main.model.Destination;

/**
 * @author Misti Christianson - mchristianson
 * CIS175 - Spring 2024
 * Apr 24, 2024
 */

@Repository
public interface DestinationRepository extends JpaRepository <Destination, Long> {

}
