package com.activiti.mapper;

import com.activiti.daoentity.ActIdUserEntity;

/**
 * Created by Administrator on 2018/9/5.
 */

public interface ActIdUserMapper {

    ActIdUserEntity findUserById(String username, String password);
}
