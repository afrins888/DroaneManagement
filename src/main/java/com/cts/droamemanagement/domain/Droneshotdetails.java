package com.cts.droamemanagement.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="droneshot")

public class Droneshotdetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "drone_shot_id")
	private Long droneshotid;
	@Column (name="drone_shot_type")
	private String droneshottype;
	public Long getDroneshotid() {
		return droneshotid;
	}
	public void setDroneshotid(Long droneshotid) {
		this.droneshotid = droneshotid;
	}
	public String getDroneshottype() {
		return droneshottype;
	}
	public void setDroneshottype(String droneshottype) {
		this.droneshottype = droneshottype;
	}
	
	
	

}
