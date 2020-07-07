package com.shaoyu.sho.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: ByteOO
 * Date: 2020/7/6 10:56
 * @Version:
 * @Description: 启动类
 */
@SpringBootApplication
@MapperScan("com.shaoyu.sho.admin.mapper")
public class ShoAdminApplication {
	public static void main(String[] args) {
		SpringApplication.run(ShoAdminApplication.class, args);
	}
}
