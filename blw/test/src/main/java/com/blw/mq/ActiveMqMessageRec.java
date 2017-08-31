package com.blw.mq;

import org.springframework.jms.core.JmsTemplate;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Created by Administrator on 2017/8/28 0028.
 */
public class ActiveMqMessageRec implements MessageListener {
    @Override
    public void onMessage(Message message) {
        TextMessage textMsg = (TextMessage) message;
        try {
            System.out.println("接收到了消息，消息内容是：" + textMsg.getText());
            try {
                System.out.println("进入时间等待");
                for (int i = 0; i < 6 ;i++) {
                    System.out.println("暂停"+i+"秒");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("我也不知道什么错了");
            }
        } catch (JMSException e) {
            e.printStackTrace();
            System.out.println("jmsException 啊啊啊啊啊");
        }
    }
}
