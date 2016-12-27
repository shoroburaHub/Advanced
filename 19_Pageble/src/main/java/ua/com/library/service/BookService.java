package ua.com.library.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.web.multipart.MultipartFile;
import ua.com.library.entity.Book;

public interface BookService {

	Page<Book> findAll(int currentPage, int numberOfItem);

	List<Book> findAll();

	void save(Book book, MultipartFile imge);
	Book findOne(int id);
	void delete(int id);

	List<Book> sortBooks(int pages);

	List<Book> liveSearch(String search);


    void save(Book book);

	List<Book> bookImges();

}
