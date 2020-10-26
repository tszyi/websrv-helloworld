package com.tszyi.demos;

import javax.xml.ws.Endpoint;

public class Main {

  public static void main(String[] args) {

    // (1) 用瀏覽器或POSTMAN 對 http://localhost:18787/api/myService?wsdl
    // 發起一個 HTTP GET 請求，即可獲得本機web service的定義檔案(wsdl)
    Endpoint.publish("http://localhost:18787/api/myService", new MyServiceImpl());
    System.out.println("服務已運行在 localhost:18787");

    // (2) 用 SOAPUI 可不須另外撰寫web service client
    //  首先建立新專案，同時選擇匯入的 wsdl 即可
    // (3) 發請求
    // 透過前個步驟取得 XML request 後，用POSTMAN發"POST"請求給本機服務。
    // 注意!要稍微修改POSTMAN裡的 Header，
    // 將Content-Type: application/xml 給拔掉。(原因是服務只接收text/xml)
    //
    // EX:
    // POST http://localhost:18787/api/myService
    // BODY:
    // <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
    // xmlns:dem="http://demos.tszyi.com/">
    //   <soapenv:Header/>
    //   <soapenv:Body>
    //      <dem:sayHello/>
    //   </soapenv:Body>
    // </soapenv:Envelope>
    //
    // EX2:
    // POST http://localhost:18787/api/myService
    // <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
    // xmlns:dem="http://demos.tszyi.com/">
    //   <soapenv:Header/>
    //   <soapenv:Body>
    //      <dem:getItems/>
    //   </soapenv:Body>
    // </soapenv:Envelope>
  }
}
