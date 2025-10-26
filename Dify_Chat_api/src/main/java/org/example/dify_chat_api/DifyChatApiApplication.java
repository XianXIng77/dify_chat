package org.example.dify_chat_api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.example.dify_chat_api.mapper")
public class DifyChatApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DifyChatApiApplication.class, args);
    }

}
