package ua.com.library.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Hibernate;

import ua.com.library.entity.Book;
import ua.com.library.entity.Student;
import ua.com.library.entity.Subject;

public class Main {
	public static void main(String[] args) {
 
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Primary");
		
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		// insert into table
//		manager.persist(new Book("java", 300));
//		manager.persist(new Book("c++", 200));
//		manager.persist(new Book("pyton", 140));
//		manager.persist(new Book("go", 250));
//		manager.persist(new Book("php", 10));
//		manager.persist(new Student("anton", "sidorov"));
//		manager.persist(new Student("igor", "smirnov"));
//		manager.persist(new Student("anna", "bukina"));
//		manager.persist(new Student("ira", "birka"));
//		manager.persist(new Student("roza", "kruzenshtein"));
//		manager.persist(new Subject("math"));
//		manager.persist(new Subject("biology"));
//		manager.persist(new Subject("economy"));
//		manager.persist(new Subject("filosofy"));
//		manager.persist(new Subject("programming"));
		
		//select one item (few methods)
//		Book book = manager.find(Book.class,1);
		//if you have in a table just a one result (no result or more than one throw exception and have to handle it)
//		Book book = (Book) manager.createQuery("select b from Book b where b.name like 'java'").getSingleResult();
		// you can't use (select * form 'someTable' in jpql)
		// this two statement give you just the same result
//		List<Book> books = manager.createQuery("from Book").getResultList();
//		List<Book> books1 = manager.createQuery("select b from Book").getResultList();
		
		//get parameter from table
//		String some = (String) manager.createQuery("select s.firstName from Student s where s.lastName like 'sidorov'").getSingleResult();
		
		//insert book for some student
//		Student student = (Student) manager.createQuery("select s from Student s where s.lastName like 'bukina'").getSingleResult();
//		List<Book>books = (List<Book>) manager.createQuery("select b from Book b where b.name like 'java' or name like 'php' or name like 'go'").getResultList();
//		
//		for (Book book : books) {
//			book.setStudent(student);
//			manager.merge(book);
//		}

		Student student = (Student) manager.createQuery("select s from Student s where s.lastName like 'bukina'").getSingleResult();
//		
//		List<Subject> subjects = manager.createQuery("select s from Subject s where s.name like 'math' or name like 'filosofy'").getResultList();
//		System.out.println(student);
//		System.out.println(subjects);
//		
//		student.setSubjects(subjects);
		
//		Hibernate.initialize(student);
		
		System.out.println(student.getLastName() +" "+ student.getSubjects());
		
		
		manager.getTransaction().commit();
		manager.close();
		factory.close();

	}
}
