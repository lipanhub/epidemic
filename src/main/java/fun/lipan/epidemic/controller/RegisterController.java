package fun.lipan.epidemic.controller;

import fun.lipan.epidemic.entity.Clazz;
import fun.lipan.epidemic.entity.User;
import fun.lipan.epidemic.service.ClazzService;
import fun.lipan.epidemic.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @description:
 * @author: lipan
 * @time: 2020/6/2 12:50
 */
@Controller
public class RegisterController {

    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private ClazzService clazzService;

    @GetMapping("/register")
    public String register(Model model) {
        List<Clazz> clazzList = clazzService.findAll();
        model.addAttribute("clazzList", clazzList);
        return "register";
    }

    @PostMapping("/register")
    public String register(User user, HttpServletRequest request) {
        User dbUser = (User) userService.loadUserByUsername(user.getUsername());
        if (null == dbUser) {
            user.setRole("ROLE_STUDENT");
            userService.addOne(user);
        }
        if (user.getRoleId() == 1){
            return "/login";
        }else{
            return "redirect:index";
        }

    }
}
