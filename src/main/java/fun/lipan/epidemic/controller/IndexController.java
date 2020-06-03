package fun.lipan.epidemic.controller;

import fun.lipan.epidemic.dto.ReportDto;
import fun.lipan.epidemic.entity.User;
import fun.lipan.epidemic.service.ReportService;
import fun.lipan.epidemic.util.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @description:
 * @author: lipan
 * @time: 2020/6/1 14:52
 */
@Controller
public class IndexController {

    @Autowired
    private ReportService reportService;

    @RequestMapping("/")
    public String defaultPage() {
        return "redirect:index";
    }

    @RequestMapping("/index")
    public String index(Model model) {
        User user = UserUtil.getLoginUser();
        model.addAttribute("user", user);
        List<ReportDto> reportList = reportService.findByUserRole(user);
        model.addAttribute("reportList", reportList);
        return "index";
    }
}
