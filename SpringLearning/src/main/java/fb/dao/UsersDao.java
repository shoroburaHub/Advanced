package fb.dao;

import fb.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Yulian Bulbuk on 23.04.2016.
 */
public interface UsersDao extends JpaRepository<User, Integer> {
}
