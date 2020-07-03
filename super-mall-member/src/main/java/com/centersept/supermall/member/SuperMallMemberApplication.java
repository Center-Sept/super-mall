package com.centersept.supermall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.centersept.supermall.member.feigh")
@SpringBootApplication
public class SuperMallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(SuperMallMemberApplication.class, args);
    }

}
