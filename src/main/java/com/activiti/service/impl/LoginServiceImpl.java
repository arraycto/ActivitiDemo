package com.activiti.service.impl;

import com.activiti.daoentity.ActIdUserEntity;
import com.activiti.mapper.ActIdUserMapper;
import com.activiti.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/9/5.
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private ActIdUserMapper actIdUserMapper;

    @Override
    public String login(String username, String password) {
        String result = "false";

        ActIdUserEntity actIdUserEntity = actIdUserMapper.findUserById(username,password);
        if (null == actIdUserEntity){
            result = "false";
        }else {
            result = "true";
        }
        return result;
    }
}
