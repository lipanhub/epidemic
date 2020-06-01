package fun.lipan.epidemic.controller;

import fun.lipan.epidemic.entity.User;
import fun.lipan.epidemic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description:
 * @author: lipan
 * @time: 2020/6/1 13:08
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String index( Model model) {
        User user = userService.findById("1");
        model.addAttribute("user", user);
        return "index";
    }

}
