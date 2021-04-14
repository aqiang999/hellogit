package com.lol.utils;

public class Demo1 {

  public static void main(String[] args) {
    Mehtod(10, 10);
//    int b = 20;
//    change(b);// 实参  实际上的参数
//    System.out.println(b);
  }

  public static void change(int a) {//形参  形式上的参数
    a = 100;
  }

  public static void Mehtod(double height, int count) {
    double countheight = height;
    double currentheight = height;
    if (count > 0) {
      if (count == 1) {
        System.out.println("第一次反弹高度----：" + height + "米");
        System.out.println("第一次反弹经过的距离----：" + height + "米");
      } else {
        System.out.println("第一次反弹高度----：" + height + "米");
        System.out.println("第一次反弹经过的距离----：" + height + "米");
        System.out.println("");
        for (int i = 2; i <= count; i++) {
          currentheight = currentheight / 2;
          countheight = countheight + currentheight;
          System.out.println("第" + i + "次反弹高度----：" + currentheight + "米");
          System.out.println("第" + i + "次反弹经过的距离----：" + countheight + "米");
          System.out.println("");
        }
      }
    }
  }


}
