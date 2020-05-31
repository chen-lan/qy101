package com.aaa.service;

import com.aaa.entity.UserInfo;

import java.util.List;

/**
 * @Author: 陈建
 * @Date: 2019/9/17 0017 16:00
 * @Version 1.0
 */
public interface UserInfoBiz {
   List<UserInfo> findAllUser();
}
