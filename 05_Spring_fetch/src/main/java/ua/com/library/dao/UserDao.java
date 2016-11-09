package ua.com.library.dao;

import java.util.List;

import ua.com.library.entity.User;

public interface UserDao extends GeneralDao<User>{

	User findUserWithBooks(String username);
	
}
