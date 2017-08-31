package test.activemq;

import com.blw.test.activemq.ActiveMqMessageSend;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/8/28 0028.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-context-activemq.xml")
public class TestMq {

    @Resource(name = "messageProduct")
    private ActiveMqMessageSend producer;

    @Test
    public void testSessionAwareMessageListener() {
        for (int i = 0; i < 20; i++) {
            producer.send("是的发生的发生的"+i);
            producer.send("阿萨德刚我国庆魏国强"+i);
            producer.send("徐子轩从V字形从v"+i);
            producer.send("1231236123"+i);
        }
    }
    /*public static void main(String[] args) {
        // 加载客户端的配置定义
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context-activemq.xml");
//        ActiveMqMessageSend producer = (ActiveMqMessageSend)context.getBean("messageProduct");
        producer.send("阿斯顿发送到发送到发送到发送到发射废弃物过去玩过");
    }*/
}
