package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//스프링 부트 실행할 수 있도록 기본 정보를 자동 설정
@EnableAutoConfiguration
// 현재 클래스와 같은 패키 및 하위 패키지를 다 뒤져 컴포넌를 찾아 자동으로 생성하라는 설정!4
//@Component, @RestController, @Controller, @Service, @Repository 등이 붙은 클래스를 찾는다
//@ComponentScan

@SpringBootApplication // = @SpringBootConfiguration + @EnableAutoConfiguration + @ComponentScan
public class  App {
  public String getGreeting() {
    return "Hello World!";
  }

  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
    System.out.println("스프링부트 서버 시작!");
  }
}
