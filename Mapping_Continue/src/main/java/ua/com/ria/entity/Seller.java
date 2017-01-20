package ua.com.ria.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Seller {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String emial;
	private String phone;
	
	@OneToMany(mappedBy="seller")
	private List<Car> cars;
	
	public Seller() {
		// TODO Auto-generated constructor stub
	}
	
}
