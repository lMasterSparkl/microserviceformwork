package com.ygt.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;


@Configuration
public class MySelfRule {
@Bean
public IRule myRule() {
	return new RandomRule_YGT();//每台机器5次
}
}
