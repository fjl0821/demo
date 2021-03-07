package com.van.demo.controller;

import com.van.demo.bean.User;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiImplicitParam;
//import io.swagger.annotations.ApiImplicitParams;
//import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: VaN
 * @since: 2021/3/5 19:43
 * @remark:
 */
//@Api(tags = "登录")
@RequestMapping(path = "index")
@RestController
public class LoginController {

//    @ApiOperation(value = "登录")
//    @ApiImplicitParams({
//            @ApiImplicitParam(paramType = "query", name = "userName", value = "用户名称", required = true, dataType = "String"),
//            @ApiImplicitParam(paramType = "query", name = "password", value = "密码", required = true, dataType = "String"),
//    })
    @PostMapping(path = "login")
    public User login(String name, String password) {
       return null;
    }

}
