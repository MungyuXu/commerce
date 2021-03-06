package com.controller.controllerImpl;

import com.controller.UserController;
import com.dto.ResultState;
import com.pojo.User;
import com.qiniu.storage.model.FileListing;
import com.service.serviceImpl.UserServiceImpl;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: hokitlee
 * @description:
 * @create: 2018-09-30 17:01
 **/
@RestController
@RequestMapping("api/user")

public class UserControllerImpl implements UserController {
    final private UserServiceImpl userService;

    public UserControllerImpl(UserServiceImpl userService) {
        this.userService = userService;
    }

    @RequestMapping("login")
    public Map login(User user){
        return userService.login(user);
    }

    @RequestMapping("getUserById")
    public Map getUserById(int userId){
        return userService.getUserById(userId);
    }
}
