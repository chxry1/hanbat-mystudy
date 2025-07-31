package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
@SpringBootApplication
public class  App {
  public String getGreeting() {
    return "Hello World!";
  }

  public static void main(String[] args) {
    SpringApplication.run(Appconfig.class, args);
    System.out.println("스프링부트 서버 시작!");
  }
}
