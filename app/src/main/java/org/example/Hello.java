package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/hello")
public class Hello {

  public Hello() {
    System.out.println("Hello의 생성자가 호출됨!!");
  }
  @GetMapping(path="/hi")
  public String hi() { //요청을 처리하는 메서드 ==> request handler
    return "Hello";
  }

  @GetMapping(path="/hi2")
  public  String h2(String name) {
    return "안녕하세요 " + name +"님!";
  }

  @GetMapping(path="/hi3")
  public String hi3() { //요청을 처리하는 메서드 ==> request handler
    return "Hello Hi3";
  }

  @GetMapping(path="/hi4")
  public String hi4() { //요청을 처리하는 메서드 ==> request handler
    return "Hello Hi4";
  }
  @GetMapping(path="/hi6")
  public String hi6() { //요청을 처리하는 메서드 ==> request handler
    return "Hello Hi3";
  }
  @GetMapping(path="/hi7")
  public String hi7() { //요청을 처리하는 메서드 ==> request handler
    return "Hello Hi3";
  }
  @GetMapping(path="/hi8")
  public String hi8() { //요청을 처리하는 메서드 ==> request handler
    return "Hello Hi3";
  }
  @GetMapping(path="/hi9")
  public String hi9() { //요청을 처리하는 메서드 ==> request handler
    return "Hello Hi234";
  }

}


