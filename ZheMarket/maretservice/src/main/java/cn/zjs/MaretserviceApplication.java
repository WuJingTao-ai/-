package cn.zjs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.zjs.mapper")
public class MaretserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MaretserviceApplication.class, args);

    }

}
