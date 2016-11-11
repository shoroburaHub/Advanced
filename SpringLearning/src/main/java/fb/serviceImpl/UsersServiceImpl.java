package fb.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fb.dao.UsersDao;
import fb.entity.Users;
import fb.service.UsersService;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersDao usersDao;

    @Transactional
    public void addNewUser(String name, String secondname, String login, String password, String mail, String phone) {
        Users user = new Users(name, secondname, login, password, mail, phone);
        usersDao.save(user);
    }

    @Transactional
    public void editUser(int id, String name, String secondname, String login, String password, String mail, String phone) {
        Users user = usersDao.findOne(id);
        if (name != null) {
            user.setName(name);
        }
        if (secondname != null) {
            user.setSecondname(secondname);
        }
        if (login != null) {
            user.setMail(mail);
        }
        if (password != null) {
            user.setPassword(password);
        }
        if (mail != null) {
            user.setMail(mail);
        }
        if (phone != null) {
            user.setPhone(phone);
        }
        usersDao.save(user);
    }

    @Transactional
    public void deleteUser(int id) {
        Users user = usersDao.findOne(id);
        usersDao.delete(user);
    }

    @Transactional
    public Users findById(int id) {
        return usersDao.findOne(id);
    }

    @Transactional
    public List<Users> findAllUsers() {
        return usersDao.findAll();
    }
}
