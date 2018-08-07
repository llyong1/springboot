package cn.llyong.module.service;

import cn.llyong.module.domain.city.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: llyong
 * @date: 2018/8/3
 * @time: 16:14
 * @version: 1.0
 */
@Service
public class CityService {

    @Autowired
    private CityMapper cityMapper;

    public void getOne() {
        cityMapper.getOne();
    }
}
