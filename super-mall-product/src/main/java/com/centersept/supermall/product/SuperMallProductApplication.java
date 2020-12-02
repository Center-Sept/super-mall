package com.centersept.supermall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableFeignClients(basePackages = "com.centersept.supermall.product.feign")
@EnableTransactionManagement
@MapperScan("com.centersept.supermall.product.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class SuperMallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(SuperMallProductApplication.class, args);
    }

}
