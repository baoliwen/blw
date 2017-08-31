package com.blw.test.activemq;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
/**
 * Created by Administrator on 2017/8/28 0028.
 */
public class ActiveMqMessageSend {

    //Spring的模板，封装了很多功能
    private JmsTemplate jmsTemplate;

    public void setJmsTemplate(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }


    public void send(final String jsonString) {
        //使用JMSTemplate可以很简单的实现发送消息
        jmsTemplate.send(new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(jsonString);
            }
        });
    }

}
