package ua.com.library.dao;

import java.util.List;

public interface GeneralDao <T> {
	
	void save(T t);
	List<T> findAll();
	T findOne(String t);
	void delete(String t);
	void update(T t);
	

}
