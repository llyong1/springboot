package cn.llyong.mudule.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: llyong
 * @date: 2018/8/6
 * @time: 14:37
 * @version: 1.0
 */
@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("demo1")
    public String demo1(Model model) {
        model.addAttribute("v","zhangsan");
        return "user";
    }
}
