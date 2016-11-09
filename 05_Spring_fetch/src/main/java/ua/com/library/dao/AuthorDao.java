package ua.com.library.dao;

import ua.com.library.entity.Author;

public interface AuthorDao extends GeneralDao<Author>{


	Author getAuthorWithBooks(String surname);
	
}
