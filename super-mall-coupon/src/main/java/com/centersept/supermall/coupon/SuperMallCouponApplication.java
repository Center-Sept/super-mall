package com.centersept.supermall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author center-qkz
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SuperMallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(SuperMallCouponApplication.class, args);
    }

}
