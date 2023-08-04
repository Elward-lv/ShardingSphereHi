package com.lvyanwei.shardingshperedemo.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

@Data
public class Order implements Serializable {

    private Long orderId;

    private Long userId;

    private BigDecimal totalPrice;

    private Integer state;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
