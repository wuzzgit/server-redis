package com.redis.serverredis;

import com.redis.serverredis.util.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/redis")
public class controller {

    @Autowired
    private RedisService redisService;

    @RequestMapping("/index")
    public String index(){
        redisService.set("redis123","123996");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>"+redisService.get("redis123").toString());
        return redisService.get("redis123").toString();
    }

    @RequestMapping("/index2")
    public String index2(){
        redisService.set("redis测试","1239996eee");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>"+redisService.get("redis测试").toString());
        return redisService.get("redis123").toString();
    }
}
