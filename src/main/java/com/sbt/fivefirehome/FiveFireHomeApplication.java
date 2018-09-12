package com.sbt.fivefirehome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
/*
 * @author <a href="mailto:Will@gtmap.cn">Will</a>
 * @version 1.0, 2018/9/11
 * @description 五火球大家庭启动类，一定要放置到代码结构的最外层！！！！！！！！
 */
@EnableAutoConfiguration
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class FiveFireHomeApplication {

    public static void main(String[] args) {
        SpringApplication.run(FiveFireHomeApplication.class, args);
    }
}
