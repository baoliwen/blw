package com.blw.test.controller;

import com.blw.dao.SupplyProductMapper;
import com.blw.orderdao.TestOrderMapper;
import com.blw.entity.SupplyProduct;
import com.blw.entity.TestOrder;
import com.blw.test.thread.TestMysqlThread;
import com.blw.test.utils.IdGen;
import com.blw.test.utils.JedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by admin on 2017/8/27.
 */
@Controller
public class TestController {
    @Autowired
    private SupplyProductMapper supplyProductMapper;

    @Autowired
    private TestOrderMapper testOrderMapper;

    @RequestMapping("test")
    @ResponseBody
    public ModelMap testService() {
        /**
         * 数据库压测部分
         */
        /*for (int i = 0; i < 500; i++) {
            new Thread(new TestMysqlThread()).start();
        }*/



        String resultStrig = JedisUtils.set("key", "value", 1000);
        long longResult = JedisUtils.listAdd("list", "1");
        System.out.println("++++"+longResult);
        longResult = JedisUtils.listAdd("list", "2");
        System.out.println("......."+longResult);
        longResult = JedisUtils.listAdd("list", "3");
        System.out.println(",,,,,,,"+longResult);
        longResult = JedisUtils.listAdd("list", "4");
        System.out.println("///////"+longResult);
        longResult = JedisUtils.listAdd("list", "5");
        System.out.println("======"+longResult);
        longResult = JedisUtils.listAdd("list", "6");
        System.out.println("______"+longResult);
        System.out.println(JedisUtils.getList("list", 0L, 3L));
        System.out.println(JedisUtils.getList("list"));
        JedisUtils.del("list");
        System.out.println("缓存数据+:S::::::"+JedisUtils.get("key"));
        List<SupplyProduct> list = supplyProductMapper.selectAll();
        List<TestOrder> result = testOrderMapper.selectAll();
        return new ModelMap().addAttribute("asf", "asdfasf");
    }

    @RequestMapping("index")
    public String index() {
        return "index";
    }
}
