package ua.com.ria.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class City {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private long population;
	
	@ManyToMany
	@JoinTable(name="user_city",
	joinColumns=@JoinColumn(name="id_city"),
	inverseJoinColumns=@JoinColumn(name="id_user"))
	private List<User> users;
	
	public City() {
		// TODO Auto-generated constructor stub
	}
}
