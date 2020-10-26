package com.tszyi.demos;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService // 用途為將標註的"介面"表示為一個 web service
public interface MyService {

  @WebMethod
  void sayHello();

  @WebMethod
  List<String> getItems();

  @WebMethod
  void addItem(String item);
}
