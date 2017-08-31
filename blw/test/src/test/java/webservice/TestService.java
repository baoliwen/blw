package webservice;

import com.blw.webservice.TestWebService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by admin on 2017/8/27.
 */
public class TestService {
    public static void main(String[] args) {
        // 加载客户端的配置定义
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-webservice.xml");
        // 获取定义的 Web Service Bean
        TestWebService helloService = (TestWebService) context.getBean("testServiceClient");
        String username = "Ailan";
        // 调用方法进行服务消费
        String result = helloService.sayHello(username);
        System.out.println("Result:" + result);
    }
}
