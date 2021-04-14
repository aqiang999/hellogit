package com.lol.service;

import com.lol.utils.Cache;
import com.lol.utils.CacheManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoTest {

  @GetMapping("/setPhone/{phone}")
  public Integer set(@PathVariable("phone") Integer phone) {
    DemoService demoService = new DemoService();
    Integer a=demoService.pf(phone);
    Cache cache=new Cache();
    cache.setKey(""+phone);
    cache.setValue(a);
    cache.setTimeOut(1);
    cache.setExpired(false);
    CacheManager.putCacheInfo(""+phone,cache,1);
    if (CacheManager.cacheExpired(CacheManager.getCacheInfo(""+phone))){
      CacheManager.clearOnly(""+phone);
    }
    System.out.println(CacheManager.getCacheInfo(""+phone).toString());
    return a;
  }

  @GetMapping("/getPhone/{phone}")
  public Integer get(@PathVariable("phone") Integer phone) {
    DemoService demoService = new DemoService();
    if (CacheManager.cacheExpired(CacheManager.getCacheInfo(""+phone))){
      CacheManager.clearOnly(""+phone);
    }
    System.out.println(CacheManager.getCacheInfo(""+phone).toString());
    return demoService.pf(phone);
  }

  @GetMapping("/get/{phone}")
  public Integer gets(@PathVariable("phone") Long phone) {
    DemoService demoService = new DemoService();
    return demoService.psf(phone);
  }
}
