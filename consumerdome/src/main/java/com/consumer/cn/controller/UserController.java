package com.consumer.cn.controller;


import com.consumer.cn.client.UserClient;
import com.consumer.cn.pojo.User;
//import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("user")
//@DefaultProperties(defaultFallback = "default_fallbackMethod")
public class UserController {

    /*@Autowired
    private RestTemplate restTemplate;
    @Autowired
    private DiscoveryClient discoveryClient;*/

    @Autowired
    private UserClient userClient;
    @GetMapping("/{id}")
    //@HystrixCommand
    public String queryById(@PathVariable("id") Long id) {
        /*String url ="http://PRODUCT-SERVICE/user/"+id;
        ServiceInstance instance = discoveryClient.getInstances("PRODUCT-SERVICE").get(0);
        //String url = "http://" + instance.getHost() + ":" + instance.getPort() + "/user/" + id;
        String user = restTemplate.getForObject(url, String.class);
        //.setUsername("post:"+instance.getPort());*/
        User user = userClient.queryById(id);
        return String.valueOf(user);
    }

    public String default_fallbackMethod() {
        return "不好意思，服务降级了！！！！！！";
    }
}