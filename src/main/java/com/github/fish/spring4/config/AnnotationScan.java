package com.github.fish.spring4.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * 扫描配置，排除掉不需要扫描的类型
 * 
 * @author Administrator
 *
 */
@ComponentScan(basePackages="com.github.fish.spring4",excludeFilters=@Filter(type=FilterType.ASSIGNABLE_TYPE,classes= AnimalConfig.class))
@Configuration
public class AnnotationScan {

}
