package com.lvyanwei.shardingshperedemo.config.algorithm;

import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingValue;

import java.util.*;

/**
 * Sharding Sphere 分片算法
 * @author lvyanwei
 * @date 2023/08/23
 */
public class HashModShardingAlgorithm implements ComplexKeysShardingAlgorithm<String> {
    @Override
    public Collection<String> doSharding(Collection<String> availableTargetNames, ComplexKeysShardingValue<String> shardingValue) {
        List<String> shardingSuffix = new ArrayList<>();
        String tableLogicName = "t_order_";

        Map<String, Collection<String>> columnNameAndShardingValuesMap = shardingValue.getColumnNameAndShardingValuesMap();
        Set<Map.Entry<String, Collection<String>>> entries = columnNameAndShardingValuesMap.entrySet();
        Map.Entry<String, Collection<String>> entry = entries.iterator().next();
        Collection<String> values = entry.getValue();
        for (Object value : values) {
            long  hash = value.hashCode();
            long index = Math.abs(hash % availableTargetNames.size()) + 1;
            String tableName = tableLogicName + index;
            if(availableTargetNames.contains(tableName)){
                shardingSuffix.add(tableName);
            }
        }
        return shardingSuffix;
    }


}
