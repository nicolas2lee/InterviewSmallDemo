package tao.user.controller;

import org.springframework.ui.Model;
import tao.user.object.User;
import tao.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by xinrui on 10/01/17.
 */
@RestController
@RequestMapping("users")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/all")
    public List<User> getUserList(){
        return userService.getUserList();
    }

    @RequestMapping("/find")
    public List<User> getUserListWithCondition(){
        return userService.getUserListWithCondition();
    }
/*
    for rendering jsp file, @RestCOntroller should be changed into @Controller
    @RequestMapping("/hello")
    public String hello(Model model){
        return "hello";
    }
    */
}
