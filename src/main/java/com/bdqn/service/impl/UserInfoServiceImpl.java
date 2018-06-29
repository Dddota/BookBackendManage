package com.bdqn.service.impl;

import com.bdqn.entity.UserInfo;
import com.bdqn.service.UserInfoService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName com.bdqn.service.impl
 * @Description
 * @Author Liuying[albertliuy@foxmail.com]
 * @Date 2018/5/27 17:49
 */
@Service("UserInfoService")
public class UserInfoServiceImpl implements UserInfoService {
    @Override
    public List<UserInfo> getAllUser() {
        return null;
    }

    @Override
    public int regUser(UserInfo userInfo) {
        return 0;
    }
}
