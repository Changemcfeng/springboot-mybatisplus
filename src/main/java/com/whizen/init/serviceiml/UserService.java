package com.whizen.init.serviceiml;

import com.whizen.init.entity.User;
import com.whizen.init.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {

    @Autowired
    UserMapper mapper;

    public List<User> login(){
        return mapper.login();
    }

}
