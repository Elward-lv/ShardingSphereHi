package com.lvyanwei.shardingshperedemo;

import com.lvyanwei.shardingshperedemo.dao.OrderDAO;
import com.lvyanwei.shardingshperedemo.dao.PeopleDAO;
import com.lvyanwei.shardingshperedemo.entity.Order;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Map;

@SpringBootTest
class ShardingShpereDemoApplicationTests {

    @Resource
    private OrderDAO orderDAO;

    @Resource
    private PeopleDAO peopleDAO;

    @Test
    public void testInsert() {
        for (int i = 0 ; i < 10; i++){
            Order order = new Order();
            order.setUserId(1L);
            order.setState(0);
            order.setTotalPrice(new BigDecimal((i + 1) * 5));
            order.setCreateTime(LocalDateTime.now());
            order.setUpdateTime(order.getCreateTime());
            this.orderDAO.insert(order);
        }
    }

    @Test
    public void testQueryMap() {
        Map<String, String> stringStringMap = peopleDAO.selectMap();
        System.out.println(stringStringMap);
    }
}
