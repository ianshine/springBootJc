package com.springbootTest.controller;

import com.springbootTest.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by ian on 2018/三月/15.
 */

@RestController
public class userController {

    @RequestMapping("/getUser")
    public User getUser() {
        User u = new User();
        u.setName("ian");
        u.setPassword("123456");
        u.setAge(22);
        u.setDesc(null);
        u.setDate(new Date());

        return u ;
    }
}
