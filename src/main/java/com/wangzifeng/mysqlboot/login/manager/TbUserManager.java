package com.wangzifeng.mysqlboot.login.manager;

import com.wangzifeng.mysqlboot.login.dao.TbUserDao;
import com.wangzifeng.mysqlboot.login.model.TbUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class TbUserManager {
    @Resource
    TbUserDao tbUserDao;

    public TbUser getByName(@Param(value="name")String name){
        return    tbUserDao.getByName(name);
    };
}
