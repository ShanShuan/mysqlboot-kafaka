package com.wangzifeng.mysqlboot.login.dao;

import com.wangzifeng.mysqlboot.login.model.TbUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component(value = "tbUserDao")
public interface TbUserDao{
    public TbUser getByName(@Param(value="name")String name);
}
