package com.ihrm.company;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: CompanyApplication
 * @Description: Company启动类
 * @author: caoyifei
 * @date: 2022/4/14 16:10
 */
@SpringBootApplication
@MapperScan("com.ihrm.*.mapper")
public class CompanyApplication {
    public static void main(String[] args) {
        SpringApplication.run(CompanyApplication.class);
    }
}
