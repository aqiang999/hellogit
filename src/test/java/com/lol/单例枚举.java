package com.lol;

public class 单例枚举 {

  public static void main(String[] args) {
    Singleton3 s1 = Singleton3.INSTANCE;
    Singleton3 s2 = Singleton3.INSTANCE;
    System.out.println(s1 == s2);
  }
}

enum Singleton3 {
  INSTANCE;

  public void sayOK() {

  }
}
