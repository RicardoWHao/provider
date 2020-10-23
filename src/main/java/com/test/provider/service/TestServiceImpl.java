package com.test.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author wanghao.29
 * @date 2020/10/23
 */
@Service
@Component
public class TestServiceImpl implements TestService {
    @Override
    public String sayHello(String name) {
        System.out.println("hello "+ name);
        return "hello " + name;
    }
}
