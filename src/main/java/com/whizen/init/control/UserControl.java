package com.whizen.init.control;

import com.whizen.init.entity.User;
import com.whizen.init.serviceiml.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserControl {

    @Autowired
    UserService service;

    @ResponseBody
    @RequestMapping("/login")
    public List<User> login() {

        return service.login();
    }
}
