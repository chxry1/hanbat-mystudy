package org.example.myapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello") // HTTP GET 요청을 처리하는 메서드 지정
    public String hello() {
        return "hello, world"; // 클라이언트에게 리턴할 콘텐트
    }

    @GetMapping("/hello2") // HTTP GET 요청을 처리하는 메서드 지정
    public String hello2(String name) {
        return "안녕하세요 " + name + "님!"; // 클라이언트에게 리턴할 콘텐트
    }
}
