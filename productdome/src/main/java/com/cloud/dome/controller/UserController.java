package com.cloud.dome.controller;

import com.cloud.dome.pojo.User;
import com.cloud.dome.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("user")
public class UserController {

    /*@Autowired
    private UserService userService;*/

    @GetMapping("/{id}")
    public User queryById(@PathVariable("id") Long id) {

        /*try {
            Thread.sleep(20000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        /*User user = this.userService.queryById(id);
        System.out.println(user.toString());*/
        return new User(12313212L,"chengcong","password",new Date(),"1231242341234");
    }
}