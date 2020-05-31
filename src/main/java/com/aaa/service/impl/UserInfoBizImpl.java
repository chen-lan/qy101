package com.aaa.service.impl;

import com.aaa.dao.UserInfoMapper;
import com.aaa.entity.UserInfo;
import com.aaa.service.UserInfoBiz;
import com.aaa.util.MySqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import tk.mybatis.mapper.mapperhelper.MapperHelper;

import java.util.List;

/**
 * @Author: 陈建
 * @Date: 2019/9/17 0017 16:01
 * @Version 1.0
 */
public class UserInfoBizImpl implements UserInfoBiz {

    /**
     * 公共的获取mapper代理对象的方法
     * @return
     */
    public  UserInfoMapper getMapper(){
        SqlSession sqlSession = MySqlSessionFactory.getSqlSession();
        //创建一个MapperHelper
        MapperHelper mapperHelper = new MapperHelper();
        mapperHelper.processConfiguration(sqlSession.getConfiguration());
        return  sqlSession.getMapper(UserInfoMapper.class);
    }
    @Override
    public List<UserInfo> findAllUser() {
        return getMapper().selectAll();
    }
}
