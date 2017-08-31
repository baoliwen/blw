package com.blw.test.webservice;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * Created by admin on 2017/8/27.
 */
@WebService(endpointInterface = "com.blw.test.webservice.TestWebService",targetNamespace = "http://webservice.test.blw.com/")
public class TestWebServiceImpl implements TestWebService {

    public String sayHello(String str) {
        return "你在说什么？我是webservice，你是在叫我么？";
    }
}
