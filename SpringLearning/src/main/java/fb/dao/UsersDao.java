package fb.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fb.entity.Users;

/**
 * Created by Yulian Bulbuk on 23.04.2016.
 */
public interface UsersDao extends JpaRepository<Users, Integer> {
}
