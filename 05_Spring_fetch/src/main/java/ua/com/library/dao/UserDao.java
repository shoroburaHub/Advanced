package ua.com.library.dao;

import java.util.List;

import ua.com.library.entity.User;

public interface UserDao {

	void save(User user);
	List<User> findAll();
	User findOne(String username);
	void delete(String username);
	void update(User user);
	User findUserWithBooks(String username);
	
}
