package com.activiti.service;

/**
 * Created by Administrator on 2018/9/5.
 */
public interface LoginService {
    /**
     * 功能描述：用户登陆判断
     * @param username
     * @param password
     * @return
     */
    String login(String username, String password);
}
