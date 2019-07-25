package com.liu.project.controller;/**
 * @author yonrun
 * @Title: TestController
 * @ProjectName moduleProject
 * @Description: TODO
 * @date 2019/7/25 18:15
 */

import com.liu.project.entity.UserInfo;
import com.liu.project.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author
 * @description
 * @date 2019/7/25
 */

@RestController
@RequestMapping("demo")
public class TestController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("hello")
    public String hello(){
        System.out.println("========");
        UserInfo userInfo=userInfoService.queryUserInfo(1);
        return userInfo.toString();
    }
}
