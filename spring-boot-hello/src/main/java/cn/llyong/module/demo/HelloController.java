package cn.llyong.module.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: llyong
 * @date: 2018/8/3
 * @time: 13:12
 * @version: 1.0
 */
@RestController
public class HelloController {

    @RequestMapping("hello")
    public String hello() {
        System.out.println("执行HelloController请求类。。。。。");
        return "{\"name\":\"zhangsan\"}";
    }
}
