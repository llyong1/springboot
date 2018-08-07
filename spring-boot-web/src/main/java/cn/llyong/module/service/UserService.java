package cn.llyong.module.service;

import cn.llyong.module.domain.user.CmUser;
import cn.llyong.module.domain.user.CmUserExample;
import cn.llyong.module.domain.user.CmUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @description:
 * @author: llyong
 * @date: 2018/8/5
 * @time: 10:45
 * @version: 1.0
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserService {

    @Autowired
    private CmUserMapper cmUserMapper;

    public List<CmUser> selectByExample(Long userId) {
        CmUserExample example = new CmUserExample();
        example.createCriteria().andUserIdEqualTo(userId);
        return cmUserMapper.selectByExample(example);
    }
}
