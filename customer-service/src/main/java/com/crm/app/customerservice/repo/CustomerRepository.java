package com.crm.app.customerservice.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.crm.app.customerservice.entity.Customer;
import com.vaadin.flow.data.provider.DataProvider;
public interface CustomerRepository extends JpaRepository<Customer, Long>{

	//DataProvider<Customer, Void> findByLastNameStartsWithIgnoreCase(String lastName);

}
