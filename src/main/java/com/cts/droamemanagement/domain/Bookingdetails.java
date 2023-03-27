package com.cts.droamemanagement.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="booking_details")

public class Bookingdetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "booking_id")
	private Long bookingid;
	@Column (name= "location_id")
	private Long locationid;
	@Column (name="drone_shot_id")
	private Long droneshotid;
	@Temporal(TemporalType.TIMESTAMP)
	@Column (name="created_time")
	private Date createdtime;
	public Long getBookingid() {
		return bookingid;
	}
	public void setBookingid(Long bookingid) {
		this.bookingid = bookingid;
	}
	public Long getLocationid() {
		return locationid;
	}
	public void setLocationid(Long locationid) {
		this.locationid = locationid;
	}
	public Long getDroneshotid() {
		return droneshotid;
	}
	public void setDroneshotid(Long droneshotid) {
		this.droneshotid = droneshotid;
	}
	public Date getCreatedtime() {
		return createdtime;
	}
	public void setCreatedtime(Date createdtime) {
		this.createdtime = createdtime;
	}
	
	
	
}

	