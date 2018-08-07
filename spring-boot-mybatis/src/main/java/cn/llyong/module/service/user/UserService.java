package cn.llyong.module.service.user;

import cn.llyong.module.domain.user.User;
import cn.llyong.module.domain.user.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: llyong
 * @date: 2018/8/4
 * @time: 10:10
 * @version: 1.0
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public void getOne() {
        User user = userMapper.getOne();
        System.out.println(user);
    }
}
