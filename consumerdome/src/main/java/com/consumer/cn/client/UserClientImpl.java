package com.consumer.cn.client;

import com.consumer.cn.pojo.User;
import org.springframework.stereotype.Component;

@Component
public class UserClientImpl implements UserClient {
    @Override
    public User queryById(Long id) {
        User user=new User();
        user.setUsername("未知用户");
        return user;
    }
}
