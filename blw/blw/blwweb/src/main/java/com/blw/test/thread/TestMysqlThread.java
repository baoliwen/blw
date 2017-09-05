package com.blw.test.thread;

import com.blw.entity.TestOrder;
import com.blw.orderdao.TestOrderMapper;
import com.blw.test.utils.IdGen;
import com.blw.test.utils.SpringContextHolder;

/**
 * Created by admin on 2017/9/5.
 */
public class TestMysqlThread implements Runnable {

    private TestOrderMapper testOrderMapper = SpringContextHolder.getBean(TestOrderMapper.class);

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        System.out.println("开始保存时间"+start);
        TestOrder order = new TestOrder();
        order.setId(IdGen.uuid());
        order.setTestOrdercol("12341234");
        testOrderMapper.insert(order);
        System.out.println("保存消耗时间"+((System.currentTimeMillis() - start)/1000));
    }
}
