package fun.lipan.epidemic.controller;

import fun.lipan.epidemic.entity.HealthState;
import fun.lipan.epidemic.service.HealthStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: lipan
 * @time: 2020/6/2 19:30
 */
@Controller
public class HealthStateController {
    @Autowired
    private HealthStateService healthStateService;
    @ResponseBody
    @RequestMapping("/health")
    public Map<String,List<HealthState>> queryHealthState(){
        Map<String,List<HealthState>> res = new HashMap<>();
        List<HealthState> healthStateList = healthStateService.findAll();
        res.put("healthStateList",healthStateList);
        return res;
    }
}
