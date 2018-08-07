package cn.llyong.module;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:
 * @author: llyong
 * @date: 2018/8/7
 * @time: 11:57
 * @version: 1.0
 */
@Controller
public class LoginController {

    @GetMapping("login")
    public String turnLogin () {
        return "login";
    }

    @PostMapping("login")
    public String login (String username, String password, Model model) {
        try {
            Subject subject = SecurityUtils.getSubject();
            subject.login(new UsernamePasswordToken(username,password));
            model.addAttribute("m",(String) SecurityUtils.getSubject().getPrincipal());
            return "index";
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("msg","用户或者密码错误！");
            return "login";
        }
    }

    @RequestMapping("index")
    public String turnIndex (Model model) {
        Session session = SecurityUtils.getSubject().getSession();
        String username = (String) SecurityUtils.getSubject().getPrincipal();
        model.addAttribute("m",username);
        return "index";
    }
}
