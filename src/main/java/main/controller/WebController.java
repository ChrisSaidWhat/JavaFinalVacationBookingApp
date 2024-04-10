package main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import main.model.Trip;
import main.repository.TravelRepository;

/**
 * @author Misti Christianson - mchristianson
 * CIS175 - Spring 2024
 * Apr 3, 2024
 */
@Controller
public class WebController {
	@Autowired
	TravelRepository repo;
	
	@GetMapping("/viewAll")
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
		model.addAttribute("newTrip", trip);
		return "tripDetails";
	}
	
	@PostMapping("/tripDetails")
	public String addNewBooking(@ModelAttribute Trip trip, Model model) {
		return null;
	}
	
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
	
	@PostMapping("/update/{id}")
	public String reviseBooking(Trip trip, Model model) {
		//need to un-reserve dates/times for CarRental/Flights/Lodging and change the reserve dates
		//if they want to change a CarRental/Flights/Lodging
			//go into each individually-unreserve and then choose new dates?
		
		repo.save(trip);
		return viewAllBookings(model);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteTrip(@PathVariable("id") long id, Model model) {
		Trip trip = repo.findById(id).orElse(null);
		//need to un-reserve dates/times for CarRental/Flights/Lodging
		repo.delete(trip);
		return viewAllBookings(model);
	}
	
}
