package com.activiti.controller;

import com.activiti.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2018/9/5.
 */
@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping(value = "/login")
    public String login(@RequestParam(name = "username") String username, @RequestParam(name = "password") String password){
        String result = loginService.login(username, password);
        if (result.equals("false")){
            return "用户名或密码错误";
        }
        return "true";
    }
}
