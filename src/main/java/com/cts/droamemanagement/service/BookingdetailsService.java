package com.cts.droamemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.droamemanagement.domain.Bookingdetails;
import com.cts.droamemanagement.repository.BookingdetailsRepositoryIfc;
@Service
public class BookingdetailsService {
@Autowired
private BookingdetailsRepositoryIfc bookingRepository;
	public List<Bookingdetails> getAllBookingdetails() {
		
		return bookingRepository.findAll();
	}
	public String addNewCustomer(Bookingdetails booking) {
		bookingRepository.save(booking);
		return "saved";
	}
	public String deleteBooking(Long id) {
		
		bookingRepository.deleteById(id);
		return "deleted";
	}

}
