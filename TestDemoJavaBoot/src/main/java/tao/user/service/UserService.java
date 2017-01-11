package tao.user.service;

import tao.user.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tao.user.object.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xinrui on 10/01/17.
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public List<User> getUserList() {
        List<User> users = new ArrayList<User>();
        System.out.println(userDao.findAll());
        userDao.findAll().iterator().forEachRemaining(users::add);
        return users;
    }
}
