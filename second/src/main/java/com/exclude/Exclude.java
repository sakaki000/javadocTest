package com.exclude;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exclude {
  private final String name;
  public Exclude(String name) {
    this.name = name;
  }
  
  /***
   * @return String secondChange
   */
  public String getName() {
    String hoge = name;
    if(hoge.equals("A") || hoge.equals("B")) {
        System.out.println("処理a");
    } else {
        System.out.println("処理b");
    }

    if(hoge.equals("C")) {
        System.out.println("処理c");
    }
    return name;
  }
}
