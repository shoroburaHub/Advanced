package ua.com.library.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
@NamedQueries({
@NamedQuery(name="findBookByName", query="select b from Book b where b.name like :name"),
@NamedQuery(name="findAllBook", query="from Book"),
})
@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int pages;
	@ManyToOne(fetch = FetchType.LAZY)
	private Student student;

	public Book() {
	}

	public Book(String name, int pages) {
		super();
		this.name = name;
		this.pages = pages;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", pages=" + pages + ", student=" + student + "]";
	}
	
	

}
