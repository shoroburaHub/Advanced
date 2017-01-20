package ua.com.ria.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String password;
	private String email;
	
	@ManyToMany
	@JoinTable(name="user_city",
	joinColumns=@JoinColumn(name="id_user"),
	inverseJoinColumns=@JoinColumn(name="id_city"))
	private List<City> cities;
	
	@OneToMany(mappedBy="user")
	private List<Car> cars;
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
}
