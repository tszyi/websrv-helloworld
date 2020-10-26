package com.tszyi.demos;

import java.util.ArrayList;
import java.util.List;

public class Data {
  public static List<String> items;

  static {
    items = new ArrayList<>();
    items.add("123");
    items.add("zxcv");
    items.add("你好");
  }
}
