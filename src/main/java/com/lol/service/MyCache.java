package com.lol.service;

import java.util.concurrent.Callable;
import org.springframework.cache.Cache;

public class MyCache implements Cache {

  @Override
  public String getName() {
    return null;
  }

  @Override
  public Object getNativeCache() {
    return null;
  }

  @Override
  public ValueWrapper get(Object o) {
    return null;
  }

  @Override
  public <T> T get(Object o, Class<T> aClass) {
    return null;
  }

  @Override
  public <T> T get(Object o, Callable<T> callable) {
    return null;
  }

  @Override
  public void put(Object o, Object o1) {

  }

  @Override
  public void evict(Object o) {

  }

  @Override
  public void clear() {

  }
}
