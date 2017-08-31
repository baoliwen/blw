package com.blw.test.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * Created by admin on 2017/8/27.
 */
@WebService
@SOAPBinding(style = Style.RPC)
public interface TestWebService {

    @WebMethod
    String sayHello(String str);

}
