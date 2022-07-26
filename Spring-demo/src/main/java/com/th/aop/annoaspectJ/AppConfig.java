package com.th.aop.annoaspectJ;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @ClassName: AppConfig
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/6 17:28
 * @Version 1.0
 */
@Configuration
@ComponentScan(basePackages = "com.th.aop.annoaspectJ") //注解扫描
@EnableAspectJAutoProxy //开启AspectJ的自动代理
public class AppConfig {
}