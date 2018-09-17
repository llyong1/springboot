package cn.llyong.module;

import cn.llyong.module.domain.Dept;
import cn.llyong.module.domain.DeptMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMybatisplusApplicationTests {

    @Autowired
    private DeptMapper deptMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<Dept> deptList = deptMapper.selectList(null);
        deptList.forEach(System.out::println);
    }

}
