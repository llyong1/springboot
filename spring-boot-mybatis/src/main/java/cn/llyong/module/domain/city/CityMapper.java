package cn.llyong.module.domain.city;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @description:
 * @author: llyong
 * @date: 2018/8/3
 * @time: 16:13
 * @version: 1.0
 */
@Mapper
public interface CityMapper {

    @Select("select * from city where id = 2")
    City getOne() ;
}
