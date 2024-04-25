package main.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.print.attribute.standard.Destination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.server.WebServerException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import main.model.Person;
import main.model.Trip;
import main.repository.DestinationRepository;
//import main.repository.PersonRepository;
import main.repository.TravelRepository;
import org.springframework.web.server.ResponseStatusException;

import static org.springframework.http.HttpStatus.NOT_FOUND;

/**
 * @author Misti Christianson - mchristianson
 * CIS175 - Spring 2024
 * Apr 3, 2024
 */
@Controller
public class WebController {
	@Autowired
	TravelRepository repo;
	
	@Autowired
	DestinationRepository destRepo;
	
//	@Autowired
//	PersonRepository personRepo;
	
	//	the fix in the line below allows us to not have to use an index.html file - CS 04/13
	@GetMapping({"/", "/viewAll"})
	public String viewAllBookings(Model model) {
		if(repo.findAll().isEmpty()) {
			return addNewBooking(model);
		}
		
		model.addAttribute("bookings", repo.findAll());
		return "viewAll";
	}
	
	@GetMapping("/tripDetails")
	public String addNewBooking(Model model) {
		Trip trip = new Trip();
//		Person person = new Person();
		model.addAttribute("newTrip", trip);
		model.addAttribute("destinations", destRepo.findAll());
		return "tripDetails";
	}
	
	@PostMapping("/tripDetails")
	public String addNewBooking(@ModelAttribute Trip trip, Model model) {
		repo.save(trip);
		//or move on to next step of trip planning process
		//return addDestination(model);
		return viewAllBookings(model);	
	}
	
	/*
	 * @GetMapping("/inputDestination") 
	 * public String addDestination(Model model) {
	 * 
	 * return null; }
	 * 
	 * 
	 * 
	 * @GetMapping("/inputDestination") 
	 * public String addDestination(@ModelAttribute Destination destination, Model model) { 
	 * 
	 * //return addFlight(model); 
	 * return null;
	 * 
	 *  }
	 */
//	@PostMapping("/tripDetails")
//	public String addNewBooking(@ModelAttribute Trip trip, Model model) {
//		repo.save(trip);
//		return "tripDetails";
//	}
//	@GetMapping("/editDestination{id}")
//	public String showUpdateDestination(@PathVariable("id") long id, Model model) {
//		return null;
//	}
//	@GetMapping("/editLodging{id}")
//	public String showUpdateLodging(@PathVariable("id") long id, Model model) {
//		return null;
//	}
//	
//	@GetMapping("/editRental{id}")
//	public String showUpdateRental(@PathVariable("id") long id, Model model) {
//		return null;
//	}

	@GetMapping("/editDestination{id}")
	public String showUpdateDestination(@PathVariable("id") long id, Model model) {
		Trip destination = repo.findById(id).orElse(null);
		System.out.println("ITEM TO EDIT: " + destination.toString());
		model.addAttribute("newDestination", destination);
		return "input";
	}
	
	@GetMapping("/editLodging{id}")
	public String showUpdateLodging(@PathVariable("id") long id, Model model) {
		Trip lodging = repo.findById(id).orElse(null);
		System.out.println("ITEM TO EDIT: " + lodging.toString());
		model.addAttribute("newLodging", lodging);
		return "input";
	}
	
	@GetMapping("/editRental{id}")
	public String showUpdateRental(@PathVariable("id") long id, Model model) {
		Trip rental = repo.findById(id).orElse(null);
		System.out.println("ITEM TO EDIT: " + rental.toString());
		model.addAttribute("newRental", rental);
		return "input";
	}
	
	@PostMapping({"/update/", "/update/{id}"})
	public String reviseBooking(Trip trip, Model model) {
		//need to un-reserve dates/times for CarRental/Flights/Lodging and change the reserve dates
		//if they want to change a CarRental/Flights/Lodging
		//go into each individually-unreserve and then choose new dates?
		
		var savedTrip = repo.save(trip);
		return "redirect:/view/%s".formatted(savedTrip.getTripId());
	}
	
	@GetMapping("/delete/{id}")
	public String deleteTrip(@PathVariable("id") long id) {
		Trip trip = repo.findById(id)
				.orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "Unable to find trip %d".formatted(id)));
		repo.delete(trip);
		return "redirect:/viewAll";
	}

	@GetMapping("/edit/{id}")
	public String editTrip(@PathVariable("id") long id, Model model) {
		Trip trip = repo.findById(id)
				.orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "Unable to find trip %d".formatted(id)));
		model.addAttribute("newTrip", trip);
		model.addAttribute("destinations", destRepo.findAll());
		return "tripDetails";
	}

	@GetMapping("/view/{id}")
	public String viewTrip(@PathVariable("id") long id, Model model) {
		Trip trip = repo.findById(id)
				.orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "Unable to find trip %d".formatted(id)));
		model.addAttribute("trip", trip);
		return "results";
	}
	
	//Added info to grab trip details from the database
	@GetMapping("/trip")
    public Trip getTripById(@RequestParam Long id) {
        Optional<Trip> optionalTrip = repo.findById(id);
        return optionalTrip.orElse(null); // Return null if not found
    }

    @GetMapping("/trips")
    public List<Trip> getAllTrips() {
        return repo.findAll();
    }
    
 //	this along with its accompanying method in the travel repo broke my code so I have commented it out - CS 04/13
    
//    @GetMapping("/trips/destination")
//    public List<Trip> getTripsByDestination(@RequestParam String destination) {
//        return repo.findByDestination(destination);
//    }
	
}

