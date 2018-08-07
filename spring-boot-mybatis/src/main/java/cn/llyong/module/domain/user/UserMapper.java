package cn.llyong.module.domain.user;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @description:
 * @author: llyong
 * @date: 2018/8/4
 * @time: 10:08
 * @version: 1.0
 */
@Mapper
public interface UserMapper {

    @Select("select * from ba_user where id = 1")
    User getOne() ;
}