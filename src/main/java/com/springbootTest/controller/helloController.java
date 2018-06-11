package com.springbootTest.controller;

import com.springbootTest.pojo.Resource;
import com.springbootTest.util.JSONResult;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ian on 2018/三月/15.
 */

@RestController
public class helloController {

    @Autowired
    private Resource resource;

    @RequestMapping("/hello")
    public Object hello() {
        return "hello springboot!";
    }

    @RequestMapping("/getResource")
    public JSONResult getSource() {

        Resource bean = new Resource();
        BeanUtils.copyProperties(resource,bean);
        return JSONResult.ok(bean);
    }
}
