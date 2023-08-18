package com.lvyanwei.shardingshperedemo.config.anatation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author lvyanwei
 * @date 2023/08/18
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MapF2M {

    /**
     * 键值列名
     */
    String key();

    /**
     * value列名
     */
    String value();

    /**
     * 是否允许key重复。如果不允许，而实际结果出现了重复，会抛出org.springframework.dao.DuplicateKeyException。
     *
     * @return
     */
    boolean isAllowKeyRepeat() default true;
    /**
     * 对于相同的key，是否允许value不同(在允许key重复的前提下)。如果允许，则按查询结果，后面的覆盖前面的；如果不允许，则会抛出org.springframework.dao.DuplicateKeyException。
     *
     * @return
     */
    boolean isAllowValueDifferentWithSameKey() default false;

}
