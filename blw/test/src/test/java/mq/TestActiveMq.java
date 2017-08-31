package mq;

import com.blw.mq.ActiveMqMessageRec;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/8/28 0028.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-context-activemq.xml")
public class TestActiveMq {
    @Resource(name = "consumer")
    private ActiveMqMessageRec producer;

    public void testRec() {
        System.out.println(producer);
    }
}
