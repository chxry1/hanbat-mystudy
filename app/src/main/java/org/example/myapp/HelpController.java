package org.example.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelpController { // 클래스 이름은 대문자로 시작하는 게 관례예요

    @GetMapping("/help")
    public String help() {
        return "help";  // templates/help.html 을 찾아서 렌더링
    }
}
