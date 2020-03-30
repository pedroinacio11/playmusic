package com.phinacio.udemy.customer.save.service.gateway.repository;

import com.phinacio.udemy.customer.save.service.domain.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CustomerRepository extends CrudRepository<Customer, UUID> {

}