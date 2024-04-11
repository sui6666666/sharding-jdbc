package com.cxytiandi.sharding.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cxytiandi.sharding.domain.entity.User;
import com.cxytiandi.sharding.mapper.UserMapper;
import com.cxytiandi.sharding.service.UserService;
import org.apache.shardingsphere.infra.hint.HintManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* @author EDY
* @description 针对表【user_0】的数据库操作Service实现
* @createDate 2024-03-14 11:59:54
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

    @Override
    @Transactional(readOnly = false)
    public void insert2(User user) {
//        HintManager instance = HintManager.getInstance();
//        instance.addDatabaseShardingValue("user", "ds1"); // 指定数据库名字
//        instance.setDatabaseShardingValue("ds1");
//        instance.setDatabaseShardingValue("ds0");
//        HintManager.getInstance().addTableShardingValue("user",1);
        baseMapper.insert(user);
//        instance.close();
    }
}




