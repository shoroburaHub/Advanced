package ua.com.library.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;
import ua.com.library.entity.Book;

import java.util.List;

public interface BookDao extends JpaRepository<Book, Integer> {


    @Query("select b from Book b where b.pages > :pages")
    List<Book> sortBooks(@Param("pages") int pages);


    @Query("select b from Book b where b.title LIKE CONCAT('%',:search,'%')")
    List<Book> liveSearch(@Param("search") String search);


}
