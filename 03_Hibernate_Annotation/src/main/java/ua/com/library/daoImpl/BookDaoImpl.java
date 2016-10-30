package ua.com.library.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ua.com.library.dao.BookDao;
import ua.com.library.entity.Book;

public class BookDaoImpl implements BookDao {

	private EntityManager entityManager;

	public BookDaoImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	
	public void save(Book book) {
		entityManager.getTransaction().begin();
		entityManager.persist(book);
		entityManager.getTransaction().commit();
	}

	public List<Book> findAll() {
		return entityManager.createQuery("form Book").getResultList();
	}

	public Book findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
