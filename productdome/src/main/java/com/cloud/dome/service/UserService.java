package com.cloud.dome.service;

//import com.cloud.dome.mapper.UserMapper;
import com.cloud.dome.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

   /* @Autowired
    private UserMapper userMapper;*/

    public User queryById(Long id) {
        return new User();
    }
}