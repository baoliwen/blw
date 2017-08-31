package com.blw.test.dubboImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.blw.test.dubbo.BlwDubboService;
import org.springframework.stereotype.Component;

/**
 * Created by admin on 2017/8/27.
 */
@Component
@Service
public class TestDubboServiceImpl implements BlwDubboService {
    @Override
    public String getDubboService(String str) {
        return "调用dubbo接口成功,啊哈哈哈哈哈哈哈哈哈哈哈"+str;
    }
}
