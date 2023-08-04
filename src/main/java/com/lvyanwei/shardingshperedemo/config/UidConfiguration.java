package com.lvyanwei.shardingshperedemo.config;

import com.xfvape.uid.impl.DefaultUidGenerator;
import com.xfvape.uid.worker.DisposableWorkerIdAssigner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UidConfiguration {

    @Bean("disposableWorkerIdAssigner")
    public DisposableWorkerIdAssigner disposableWorkerIdAssigner(){
        return new DisposableWorkerIdAssigner();
    }

    @Bean
    public DefaultUidGenerator uidGenerator(DisposableWorkerIdAssigner disposableWorkerIdAssigner){
        DefaultUidGenerator defaultUidGenerator = new DefaultUidGenerator();
        defaultUidGenerator.setWorkerIdAssigner(disposableWorkerIdAssigner);
        return defaultUidGenerator;
    }
}
