package com.it.redis_spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ZYH
 * @Date 2022/02/18 10:42
 */
@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/test")
    public String redisTest() {
        redisTemplate.opsForValue().set("name", "靓仔");
        String name = (String) redisTemplate.opsForValue().get("name");
        return name;
    }
}
