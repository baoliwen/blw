package com.blw.test.controller;

import com.blw.dao.SupplyProductMapper;
import com.blw.orderdao.TestOrderMapper;
import com.blw.entity.SupplyProduct;
import com.blw.entity.TestOrder;
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
        JedisUtils.set("key", "value", 10);
        System.out.println("缓存数据+:::::::"+JedisUtils.get("key"));
        List<SupplyProduct> list = supplyProductMapper.selectAll();
        List<TestOrder> result = testOrderMapper.selectAll();
        return new ModelMap().addAttribute("asf", "asdfasf");
    }

    @RequestMapping("index")
    public String index() {
        return "index";
    }
}
