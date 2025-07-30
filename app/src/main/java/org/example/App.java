package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class  App {
  public String getGreeting() {
    return "Hello World!";
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("이름? ");
    String name = scanner.nextLine();
    System.out.printf("안녕하세요 %s 님!\n", name);
    scanner.close();
  }
}
