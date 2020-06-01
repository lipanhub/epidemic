package fun.lipan.epidemic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: lipan
 * @time: 2020/6/1 14:29
 */
@Controller
public class LoginController {
    @RequestMapping("/login")
    public String userLogin() {
        return "demo_sign";
    }

    @RequestMapping("/login-error")
    public String loginError() {
        return "login-error";
    }
}
