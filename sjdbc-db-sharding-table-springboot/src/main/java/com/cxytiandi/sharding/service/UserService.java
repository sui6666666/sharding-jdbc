package com.cxytiandi.sharding.service;

import com.cxytiandi.sharding.domain.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author EDY
* @description 针对表【user_0】的数据库操作Service
* @createDate 2024-03-14 11:59:54
*/
public interface UserService extends IService<User> {
    void insert2(User user);

}
