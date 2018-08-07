package cn.llyong.module;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "cn.llyong.module.domain")
public class SpringBootWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebApplication.class, args);
    }
}
