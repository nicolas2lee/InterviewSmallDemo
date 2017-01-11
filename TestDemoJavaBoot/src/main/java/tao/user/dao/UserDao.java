package tao.user.dao;

import tao.user.object.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by xinrui on 10/01/17.
 */
public interface UserDao extends CrudRepository<User, Long> {

}
