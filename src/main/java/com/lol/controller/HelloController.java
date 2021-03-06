package com.lol.controller;

import java.util.Arrays;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

  @RequestMapping({"/", "/index.html"})
  public String index() {
    return "dashboard";
  }

  @ResponseBody
  @RequestMapping("/hello")
  public String hello(@RequestParam("user") String user) {

    return "Hello World";
  }

  //查出用户数据，在页面展示
  @RequestMapping("/success")
  public String success(Map<String, Object> map) {
    map.put("hello", "<h1>你好</h1>");
    map.put("gg", "22");
    map.put("users", Arrays.asList("zhangsan", "lisi", "wangwu"));
    System.out.println("创建分支");
    System.out.println("克隆");
    return "success";
  }


}
