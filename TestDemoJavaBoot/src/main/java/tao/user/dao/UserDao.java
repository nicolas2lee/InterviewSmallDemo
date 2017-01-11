package tao.user.dao;

import org.springframework.data.jpa.repository.Query;
import tao.user.object.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by xinrui on 10/01/17.
 */
public interface UserDao extends CrudRepository<User, Long> {
    @Query("SELECT u FROM User u where u.age > ?1")
    public List<User> findByAge(int age);
}
