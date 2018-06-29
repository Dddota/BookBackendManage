package com.bdqn.service;

import com.bdqn.entity.UserInfo;

import java.util.List;

/**
 * @ClassName com.bdqn.service
 * @Description
 * @Author Liuying[albertliuy@foxmail.com]
 * @Date 2018/5/20 0:17
 */

public interface UserInfoService {
    List<UserInfo> getAllUser();
    int regUser(UserInfo userInfo);

}
