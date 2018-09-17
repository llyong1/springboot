package cn.llyong.module.demo;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: llyong
 * @date: 2018/9/1
 * @time: 13:25
 * @version: 1.0
 */
@Aspect
@Component
public class WebLogAspect {

    @Pointcut("execution(public * cn.llyong.module.demo..*.*(..))")
    public void webLog(){
    }

    @Before(value = "webLog()")
    public void doBefore() {
        System.out.println("执行Before。。。。。。。");
    }

    @After(value = "webLog()")
    public void doAfter() {
        System.out.println("执行After。。。。。。。");
    }

    @AfterThrowing(value = "webLog()")
    public void doAfterThrowing() {
        System.out.println("执行AfterThrowing。。。。。。。");
    }

    @AfterReturning(value="webLog()")
    public  void doAfterReturning() {
        System.out.println("执行AfterReturning。。。。。。。");
    }
}
