package cn.llyong.module;

import cn.llyong.module.service.CityService;
import cn.llyong.module.service.user.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMybatisApplicationTests {

    @Autowired
    private CityService cityService;

    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testGetOne() {
        cityService.getOne();
    }

    @Test
    public void testGetUserOne() {
        userService.getOne();
    }
}
