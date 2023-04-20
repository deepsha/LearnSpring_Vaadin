package com.crm.app.customerservice.vaadin;
import java.awt.TextArea;
import java.util.Collection;

import org.springframework.util.StringUtils;

import com.crm.app.customerservice.entity.Customer;
import com.crm.app.customerservice.repo.*;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.router.Route;

@Route("/customer-portal")
public class MainView extends VerticalLayout {

	private final CustomerRepository repo;

	final Grid<Customer> grid;

	private final Text welcometext;
	
	public MainView(CustomerSearch customerSearch,CustomerRepository repo) {
		this.repo = repo;
		this.grid = new Grid<>(Customer.class);
		this.welcometext = new Text("Welcome to customer portal!");
		
		add(welcometext);
		add(customerSearch);
		add(grid);
		listCustomers();
	}
	
	// tag::listCustomers[]
	void listCustomers() {
		
			grid.setItems(repo.findAll());
		
	}
	// end::listCustomers[]

}
