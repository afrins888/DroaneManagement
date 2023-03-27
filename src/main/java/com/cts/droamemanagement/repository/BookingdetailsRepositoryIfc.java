package com.cts.droamemanagement.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cts.droamemanagement.domain.Bookingdetails;

public interface BookingdetailsRepositoryIfc extends CrudRepository<Bookingdetails,Long> {

	List<Bookingdetails> findAll();
}
