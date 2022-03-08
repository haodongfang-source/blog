package com.drimitri.blog.controller;

import com.drimitri.blog.dao.pojo.SysUser;
import com.drimitri.blog.utils.UserThreadLocal;
import com.drimitri.blog.vo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping
    public Result test(){
        SysUser sysUser = UserThreadLocal.get();
        System.out.println(sysUser);
        return Result.success(null);
    }
}
