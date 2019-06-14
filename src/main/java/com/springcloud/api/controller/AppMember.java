package com.springcloud.api.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 会员系统  服务提供者
 * @author Administrator
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class AppMember {
	public static void main(String[] args) {
		// @EnableEurekaClient 表示将当前服务注册到Eureka上
		SpringApplication.run(AppMember.class, args);
	}
}
