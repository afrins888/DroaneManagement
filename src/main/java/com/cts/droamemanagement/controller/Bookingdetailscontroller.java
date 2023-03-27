package com.cts.droamemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cts.droamemanagement.domain.Bookingdetails;
import com.cts.droamemanagement.service.BookingdetailsService;

@RestController
public class Bookingdetailscontroller {
@Autowired
private BookingdetailsService bookingService;
@GetMapping (path="/rest/getallbookingdetails")
public List <Bookingdetails> getAllBookingdetails(){
	List<Bookingdetails> bookingdetails = bookingService.getAllBookingdetails();
			return bookingdetails;
}
@PostMapping(path="/rest/addneworupdatenbooking")
public  String  addNewBooking(@RequestBody Bookingdetails booking)  {

	return bookingService.addNewCustomer(booking);

}
@DeleteMapping(path="/rest/deletebooking/{id}")
public  String  deleteBooking(@RequestParam Long id) {

	return bookingService.deleteBooking(id);
}

}
