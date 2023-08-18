package com.lvyanwei.shardingshperedemo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author lvyanwei
 * @date 2023/08/16
 */

@Data
@TableName("people")
public class People {

    private Integer id;

    private String name;

    private String sex;
}
