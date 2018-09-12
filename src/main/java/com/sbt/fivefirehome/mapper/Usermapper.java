package com.sbt.fivefirehome.mapper;
/*
 * @author <a href="mailto:Will@gtmap.cn">Will</a>
 * @version 1.0, 2018/9/11
 * @description 用户持久层
 */

import com.sbt.fivefirehome.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Usermapper extends JpaRepository<User,Integer>{
}
