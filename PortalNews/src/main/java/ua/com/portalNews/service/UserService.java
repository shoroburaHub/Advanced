package ua.com.portalNews.service;

import ua.com.portalNews.entity.User;

import java.util.List;

/**
 * Created by admin on 18.01.2017.
 */
public interface UserService {

    void save(User user);
    List<User> findAll();
    User findOne(int id);
    void delete(int id);

}
