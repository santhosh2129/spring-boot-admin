package com.santhosh2129.spring.admin;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by santhosh on 7/1/17.
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableAdminServer
public class SpringBootSpringAdminStarter {
    public static void main(String[] arg) {
        SpringApplication.run(SpringBootSpringAdminStarter.class, arg);
    }
}
