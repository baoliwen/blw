package com.blw.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.blw.test.dubbo.BlwDubboService;
import com.blw.webservice.TestWebService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by admin on 2017/8/27.
 */
@Controller
@Component
public class TestController {
    @Resource(name = "testServiceClient")
    private TestWebService helloService;
    @Reference(interfaceClass = BlwDubboService.class,timeout = 5000,check = false)
    private BlwDubboService blwDubboService;

    @RequestMapping("test")
    @ResponseBody
    public ModelMap testService() {
        System.out.println(helloService.sayHello("12341234"));
        /*ApplicationContext context = new ClassPathXmlApplicationContext("spring-context-dubbo.xml");
        // 获取定义的 Web Service Bean
        blwDubboService = (BlwDubboService) context.getBean("testDubboService");*/
        System.out.println(blwDubboService);
        System.out.println("调用dubbo接口" + blwDubboService.getDubboService("q343523452345"));
        return new ModelMap().addAttribute("asf", "asdfasf");
    }

    @RequestMapping("index")
    public String index() {
        return "index";
    }
}
