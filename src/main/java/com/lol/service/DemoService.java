package com.lol.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

  private static CacheManager cacheManager;
  //  @Autowired
//  private CacheManager cacheManager;
  private static final Map<String, String> map = new HashMap<>();

//  @Cacheable(value = "phoneItems", key = "#phone")
  public String code(Integer phone) {
    int a;
    String b;
    System.out.println(map);
    if (Objects.isNull(map) || map.size() == 0) {
      Random random = new Random();

      a = random.nextInt(10);
      b = String.valueOf(a) + phone;
      System.err.println("a:" + a + "\t   b=" + b);
      map.put("" + phone, "" + b);
      System.out.println("map:" + map.toString());
      return b;
    } else {
      b = map.get("" + phone).toString();
      System.out.println("直接获取map中的B值：" + b);
      return b;
    }
  }

//  @Cacheable(value = "phoneItems", key = "#phone")
  public Integer pf(Integer phone) {
    Cache cache ;
//    cache.getName();
    Random random = new Random();
    int a;
    a = random.nextInt(10);
//    System.out.println(a);
    return phone + a;
  }

  @Cacheable(cacheNames = "phoneItems", key = "#phone")
  public Integer psf(Long phone) {
    Random random = new Random();
    int i = random.nextInt(10);
    return i;
  }
}
