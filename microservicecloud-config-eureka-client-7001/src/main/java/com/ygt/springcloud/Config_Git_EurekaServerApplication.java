package com.ygt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Config_Git_EurekaServerApplication {//EurekaServer服务器端启动类,接受其它微服务注册进来
public static void main(String[] args) throws Exception {
	SpringApplication.run(Config_Git_EurekaServerApplication.class, args);
}

}
