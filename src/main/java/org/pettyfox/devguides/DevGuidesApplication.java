package org.pettyfox.devguides;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.pettyfox.devguides.mapper")
public class DevGuidesApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevGuidesApplication.class, args);
    }

}
