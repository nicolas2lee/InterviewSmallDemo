package tao.user.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import tao.user.object.User;

import static org.junit.Assert.*;

/**
 * Created by xinrui on 11/01/17.
 */
public class UserServiceTest {
    private UserService userService;

    @Before
    public void setUp()  {
        userService= new UserService();
    }

    @After
    public void tearDown() {

    }

    @Test
    public void getUserList()  {
        assertTrue("ok", userService.getUserList() instanceof User);

    }

}