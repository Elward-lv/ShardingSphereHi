package com.lvyanwei.shardingshperedemo.dao;

import com.lvyanwei.shardingshperedemo.config.anatation.MapF2M;

import java.util.Map;

/**
 * @author lvyanwei
 * @date 2023/08/16
 */
public interface PeopleDAO {

    @MapF2M(key = "", value = "")
    Map<String, String> selectMap();
}
