package com.lvyanwei.shardingshperedemo.controller;

import com.xfvape.uid.UidGenerator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/app")
public class TestController {
    @Resource
    private UidGenerator uidGenerator;

    @GetMapping("/uid")
    public String generateUid(){
        return String.valueOf(uidGenerator.getUID());
    }
}
