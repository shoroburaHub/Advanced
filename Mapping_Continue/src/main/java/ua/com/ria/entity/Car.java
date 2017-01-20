package ua.com.ria.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String brend;
	private String model;

	private int yers;
	
	@ManyToOne
	private Seller seller;
	
	@ManyToOne
	private User user;

	public Car() {
		// TODO Auto-generated constructor stub
	}

}
