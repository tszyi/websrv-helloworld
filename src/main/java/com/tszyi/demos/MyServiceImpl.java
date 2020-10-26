package com.tszyi.demos;

import java.util.List;
import javax.jws.WebService;

@WebService(endpointInterface = "com.tszyi.demos.MyService")
public class MyServiceImpl implements MyService {

  @Override
  public void sayHello() {
    System.out.println("有人調用sayHello()服務");
  }

  @Override
  public List<String> getItems() {
    System.out.println("獲取 item 成功");
    return Data.items;
  }

  @Override
  public void addItem(String item) {
    Data.items.add(item);
    System.out.println("添加 item 成功");
  }
}
