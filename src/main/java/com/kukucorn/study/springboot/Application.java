package com.kukucorn.study.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

// @EnableJpaAuditing // JPA Auditing 활성화  @WebMvcTest 를 사용하게 될 때 최소한의 entity가 없다보니 에러 발생 이를 분리해준다.
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}