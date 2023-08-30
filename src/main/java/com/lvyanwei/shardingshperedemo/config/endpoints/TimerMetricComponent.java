package com.lvyanwei.shardingshperedemo.config.endpoints;

import io.micrometer.core.instrument.Metrics;
import io.micrometer.core.instrument.Timer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author lvyanwei
 * @date 2023/08/30
 */

@Slf4j
@Component
public class TimerMetricComponent {

    private Timer timer = Metrics.timer("uid_summary");

    /*private AtomicLong countUid = Metrics.gauge("count.uid", new AtomicLong(0L));

    public void setCountUid(Long countUid){
        log.info("set uid metrics: {}", countUid);
        this.countUid.set(countUid);
    }*/

    /**
     * 1.手动触发timer的计算，
     * 2.也可以使用注解的方式来计算比如@Timed
     * @param timeMs 毫秒值
     */
    public void addTimer(Long timeMs){
        //维度使用tags来标记，我定义了两个维度，一个是关联系统的id： syskey  。一个是访问的表  tablename。
        timer.record(timeMs / 1000, TimeUnit.SECONDS);
    }
}
