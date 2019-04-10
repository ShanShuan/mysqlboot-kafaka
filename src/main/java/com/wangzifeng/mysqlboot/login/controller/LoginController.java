package com.wangzifeng.mysqlboot.login.controller;

import com.wangzifeng.mysqlboot.login.dao.TbUserDao;
import com.wangzifeng.mysqlboot.login.manager.TbUserManager;
import com.wangzifeng.mysqlboot.login.model.TbUser;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/welcome")
public class LoginController {
    @Autowired
    private TbUserManager tbUserManager;
    @RequestMapping(value="login")
     public  String login(){
        TbUser user = tbUserManager.getByName("zhangsan");
         return JSONObject.fromObject(user).toString();
     }
}
