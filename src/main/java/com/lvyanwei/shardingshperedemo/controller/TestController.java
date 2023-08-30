package com.lvyanwei.shardingshperedemo.controller;

import com.lvyanwei.shardingshperedemo.config.endpoints.TimerMetricComponent;
import com.xfvape.uid.UidGenerator;
import io.micrometer.core.annotation.Timed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/app")
public class TestController {
    @Resource
    private UidGenerator uidGenerator;

    @Autowired
    private TimerMetricComponent timerMetricComponent;

    @GetMapping("/uid")
    @Timed(value = "uid_summary")
    public String generateUid(){
        //long st = System.currentTimeMillis();
        String uid = String.valueOf(uidGenerator.getUID());
        //timerMetricComponent.addTimer(System.currentTimeMillis() - st);
        return uid;
    }
}
