package ua.com.library.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.com.library.dao.UserDao;
import ua.com.library.entity.User;

@Repository
public class UserDaoImpl implements UserDao {

	@PersistenceContext(unitName = "primary")
	private EntityManager entityManager;

	@Transactional
	@Override
	public void save(User user) {
		entityManager.persist(user);
	}

	@Transactional
	@Override
	public List<User> findAll() {
		return entityManager.createNamedQuery("User.findAll").getResultList();
	}

	@Transactional
	@Override
	public User findOne(String username) {
		return (User) entityManager.createNamedQuery("User.findByUsername").setParameter("username", username)
				.getSingleResult();
	}

	@Transactional
	@Override
	public void delete(String username) {
		entityManager.remove(findOne(username));
	}

	@Transactional
	@Override
	public void update(User user) {
		entityManager.merge(user);
	}
	
	@Transactional
	@Override
	public User findUserWithBooks(String username) {
		return (User) entityManager
				.createQuery("select u from User u left join fetch u.books where u.username like :username")
				.setParameter("username", username).getSingleResult();
	}

}
