package ua.com.library.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ua.com.library.entity.Author;

public interface AuthorDao extends JpaRepository<Author, Integer>{
	
	@Query("select distinct a from Author a left join fetch a.books")
	List<Author> findAuthorWithBook();
	
}
	 