package org.example.ailocal.config;

import io.milvus.client.MilvusServiceClient;
import io.milvus.param.ConnectParam;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MilvusConnection {

    @Value("${milvus.config.ipAddr}")
    private String ipAddr;
    @Value("${milvus.config.port}")
    private Integer port;

    @Bean
    public MilvusServiceClient milvusServiceClient() {
        ConnectParam connectParam = ConnectParam.newBuilder()
                .withHost(ipAddr)
                .withPort(port)
                .build();
        System.out.println("MilvusMilvusMilvusMilvusMilvusMilvus");
        return new MilvusServiceClient(connectParam);
    }
}
