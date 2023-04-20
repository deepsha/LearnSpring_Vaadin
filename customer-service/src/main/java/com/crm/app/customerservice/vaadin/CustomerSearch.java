package com.crm.app.customerservice.vaadin;

import java.awt.Panel;

import com.vaadin.flow.component.KeyNotifier;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.select.SelectVariant;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.spring.annotation.SpringComponent;
import com.vaadin.flow.spring.annotation.UIScope;

@SpringComponent
@UIScope
public class CustomerSearch extends HorizontalLayout implements KeyNotifier {

	private final TextField searchpanel;
	private final Button searchBtn;
	private final Panel panel ;
	private final Select<String> dropdownSearch;
	public CustomerSearch()
	{
	this.panel = new Panel();
	this.searchpanel =new TextField();
	this.searchBtn =new Button("Search", VaadinIcon.SEARCH.create());
	this.dropdownSearch=new Select<>();
	
	
	dropdownSearch.setItems("Firstname", "LastName", "Country");
	dropdownSearch.setPlaceholder("Select filter criteria");

	dropdownSearch.addThemeVariants(
		    SelectVariant.LUMO_SMALL,
		    SelectVariant.LUMO_ALIGN_RIGHT,
		    SelectVariant.LUMO_HELPER_ABOVE_FIELD
		);
	add(new HorizontalLayout(dropdownSearch,searchpanel,searchBtn));

	}
}
