package com.sbt.fivefirehome.service.impl;


import com.sbt.fivefirehome.entity.User;
import com.sbt.fivefirehome.mapper.Usermapper;
import com.sbt.fivefirehome.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * @author <a href="mailto:Will@gtmap.cn">Will</a>
 * @version 1.0, 2018/9/11
 * @description 用户服务实现
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    Usermapper usermapper;

    /**
     * @param userId
     * @author <a href="mailto:juyulin@gtmap.cn">juyulin</a>
     * @rerutn
     * @description 查询用户
     */
    @Override
    public User getUserByKey(Integer userId) {
        return usermapper.findById(userId).orElse(null);
    }
}
