package com.wave.serve.depot.depotserve.controller;

import com.wave.serve.depot.depotserve.pojo.dt.UserInfo;
import com.wave.serve.depot.depotserve.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Api(tags = "user", description = "用户管理")
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation("demo hello world")
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String hello(){

        return "hello world";
    }

    @ApiOperation("login")
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    @ResponseBody
    public String login(@RequestParam String username, @RequestParam String password){
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername(username);
        userInfo.setPassword(password);
        int count = userService.login(userInfo);
        return "success";
    }

}
