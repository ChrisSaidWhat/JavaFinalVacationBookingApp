package main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import main.model.Person;

/**
 * @author Misti Christianson - mchristianson
 * CIS175 - Spring 2024
 * Apr 24, 2024
 */

@Repository
public interface PersonRepository extends JpaRepository <Person, Long> {

}
