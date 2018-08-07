package cn.llyong.module.springbootweb;

import cn.llyong.module.domain.user.CmUser;
import cn.llyong.module.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@MapperScan(value = "cn.llyong.module.domain")
@SpringBootTest
public class SpringBootWebApplicationTests {
    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void test1() {
        List<CmUser> list = userService.selectByExample(23L);
        System.out.println(list.get(0));
    }

}
