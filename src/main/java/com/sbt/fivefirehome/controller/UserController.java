package com.sbt.fivefirehome.controller;

import com.sbt.fivefirehome.entity.User;
import com.sbt.fivefirehome.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @author <a href="mailto:Will@gtmap.cn">Will</a>
 * @version 1.0, 2018/9/12
 * @description 用户控制层
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(value = "/getUser")
    public User getUser() {
    return userService.getUserByKey(1);
    }
}
