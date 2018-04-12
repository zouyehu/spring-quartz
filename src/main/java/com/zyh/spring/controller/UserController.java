package com.zyh.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @ResponseBody
    @RequestMapping(value = "testJob1", method = RequestMethod.GET)
    public void testJob1(){
        System.out.println("这是第一个任务执行-----");
        System.out.println(System.currentTimeMillis());
    }

    @ResponseBody
    @RequestMapping(value = "testJob2", method = RequestMethod.GET)
    public void testJob2(){
        System.out.println("这是第二个任务执行-----");
        System.out.println(System.currentTimeMillis());
    }
}