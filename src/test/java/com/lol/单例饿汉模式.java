package com.lol;

public class 单例饿汉模式 {

  public static void main(String[] args) {
    //测试
    Singleton s1 = Singleton.getInstance();
    Singleton s2 = Singleton.getInstance();
    System.out.println(s1 == s2);
  }
}

class Singleton {

  private Singleton() {
  }

  private final static Singleton instance = new Singleton();

  public static Singleton getInstance() {
    return instance;
  }
}
