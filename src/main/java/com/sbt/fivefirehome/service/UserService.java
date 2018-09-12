package com.sbt.fivefirehome.service;

import com.sbt.fivefirehome.entity.User;
import org.springframework.stereotype.Service;


/*
 * @author <a href="mailto:Will@gtmap.cn">Will</a>
 * @version 1.0, 2018/9/11
 * @description 用户服务接口
 */
@Service
public interface UserService {
    /**
     * @param userId
     * @author <a href="mailto:juyulin@gtmap.cn">juyulin</a>
     * @rerutn
     * @description 查询用户
     */
    User getUserByKey(Integer userId);
}
