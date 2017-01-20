package ua.com.portalNews.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.portalNews.dao.UserDao;
import ua.com.portalNews.entity.User;
import ua.com.portalNews.service.UserService;

import java.util.List;

/**
 * Created by admin on 18.01.2017.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findOne(int id) {
        return findOne(id);
    }

    @Override
    public void delete(int id) {
        userDao.delete(id);
    }
}
