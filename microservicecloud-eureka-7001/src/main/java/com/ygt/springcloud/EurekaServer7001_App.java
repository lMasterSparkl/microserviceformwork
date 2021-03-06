package com.ygt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7001_App {//EurekaServer服务器端启动类,接受其它微服务注册进来
public static void main(String[] args) throws Exception {
	SpringApplication.run(EurekaServer7001_App.class, args);
}

}
