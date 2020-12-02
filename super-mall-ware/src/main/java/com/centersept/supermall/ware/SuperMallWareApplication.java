package com.centersept.supermall.ware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.centersept.supermall.ware.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class SuperMallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(SuperMallWareApplication.class, args);
    }

}
