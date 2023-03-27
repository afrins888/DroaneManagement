package com.cts.droamemanagement.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cts.droamemanagement.domain.Customerdetails;

public interface CustomerRepositoryIfc extends CrudRepository <Customerdetails, Long>{
List<Customerdetails> findAll();
}
