package cn.llyong.module.demo;

import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: llyong
 * @date: 2018/8/3
 * @time: 13:28
 * @version: 1.0
 */
@Component
public class Dog {

    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
