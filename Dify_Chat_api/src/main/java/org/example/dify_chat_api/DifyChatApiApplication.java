package org.example.dify_chat_api;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
@MapperScan("org.example.dify_chat_api.mapper")
public class DifyChatApiApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(DifyChatApiApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("==================== 接口文档地址 ====================");
        log.info("Knife4j文档: http://localhost:8080/doc.html");
        log.info("Swagger文档: http://localhost:8080/swagger-ui/index.html");
        log.info("===================================================");
    }

}
