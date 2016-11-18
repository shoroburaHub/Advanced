package ua.com.library.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.com.library.dao.AuthorDao;
import ua.com.library.dao.BookDao;
import ua.com.library.entity.Author;
import ua.com.library.entity.Book;
import ua.com.library.service.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService{
	
	@Autowired
	private AuthorDao authorDao;
	@Autowired
	private BookDao bookDao;

	public void save(Author author) {
		authorDao.save(author);
	}

	public List<Author> findAll() {
		return authorDao.findAll();
	}

	public Author findOne(int id) {
		return authorDao.findOne(id);
	}

	public void delete(int id) {
		authorDao.delete(id);
	}
	@Transactional
	public void addBookToAuthor(Author author, int idBook) {
		
		authorDao.saveAndFlush(author);
		
		Book book = bookDao.findOne(idBook);
		
		book.setAuthor(author);
		
		bookDao.save(book);
		
	}	
	
	
	 
}
