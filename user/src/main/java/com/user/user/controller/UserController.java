package com.user.user.controller;

import com.user.user.jopo.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/User")
public class UserController {
    @RequestMapping(value = "/userzz",method = RequestMethod.GET)
    @CrossOrigin
    public List<User> Query(@RequestParam String username, @RequestParam String pwd) {
        List<User> userList = new ArrayList();
        User u = new User();
        u.setUsername(username);
        u.setPassword(pwd);
        userList.add(u);
        System.out.println(userList.toString());
        return userList;
    }
}
