package com.whizen.init.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.whizen.init.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper  extends BaseMapper<User> {
    //自定义方法
   public List<User> login();
}