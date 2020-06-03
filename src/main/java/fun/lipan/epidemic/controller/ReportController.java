package fun.lipan.epidemic.controller;

import fun.lipan.epidemic.entity.Report;
import fun.lipan.epidemic.entity.User;
import fun.lipan.epidemic.service.ReportService;
import fun.lipan.epidemic.util.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: lipan
 * @time: 2020/6/2 20:58
 */
@Controller
public class ReportController {

    @Autowired
    private ReportService reportService;

    @PostMapping("/report")
    public String report(Report report) {
        User loginUser = UserUtil.getLoginUser();
        report.setStudentId(loginUser.getId());
        report.setGmtCreate(System.currentTimeMillis());
        report.setGmtModified(report.getGmtCreate());
        reportService.addOne(report);
        return "redirect:index";
    }

    @GetMapping("/report/{id}")
    @ResponseBody
    public Map<String,Report> getOne(@PathVariable Long id) {
        Map<String,Report> res = new HashMap<>();
        Report report = reportService.getById(id);
        res.put("report",report);
        return res;
    }

    @GetMapping("/report/del/{id}")
    public String report(@PathVariable Long id) {
        reportService.delete(id);
        return "redirect:/index";
    }

    @PostMapping("/report/update")
    public String update(Report report) {
        reportService.update(report);
        return "redirect:/index";
    }
}
