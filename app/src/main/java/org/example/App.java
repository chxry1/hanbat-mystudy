package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class  App {
  public String getGreeting() {
    return "Hello World!";
  }

  public static void main(String[] args) {
    class Calculator {
      int result;
      void plus(int a) {
        this.result += a;
      }
      void minus(int a) {
        this.result -= a;
      }
    }

    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();

    c1.plus(100);
    c2.plus(555);

//    Scanner scanner = new Scanner(System.in);
//    System.out.print("이름? ");
//    String name = scanner.nextLine();
//    System.out.printf("안녕하세요 %s 님!\n", name);
//    scanner.close();
  }
}
