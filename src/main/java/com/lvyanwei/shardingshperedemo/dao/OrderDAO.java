package com.lvyanwei.shardingshperedemo.dao;

import com.lvyanwei.shardingshperedemo.entity.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderDAO {

    /**
     * 插入
     * @param order
     */
    void insert(Order order);

    /**
     * 批量查询
     * @param idList
     * @return
     */
    List<Order> selectListByIds(@Param("idList") List<Long> idList);

}
