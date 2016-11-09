package ua.com.library.dao;

import java.util.List;

import ua.com.library.entity.Book;

public interface BookDao extends GeneralDao<Book>{


	
	Book findBookWithUsers(String title);
	
}
