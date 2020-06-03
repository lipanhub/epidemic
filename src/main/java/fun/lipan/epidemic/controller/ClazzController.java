package fun.lipan.epidemic.controller;

import fun.lipan.epidemic.entity.Clazz;
import fun.lipan.epidemic.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: lipan
 * @time: 2020/6/1 13:08
 */
@Controller
public class ClazzController {

    @Autowired
    private ClazzService clazzService;

    @RequestMapping("/clazz")
    @ResponseBody
    public Map<String, List<Clazz>> queryHealthState(){
        Map<String,List<Clazz>> res = new HashMap<>();
        List<Clazz> clazzList = clazzService.findAll();
        res.put("clazzList",clazzList);
        return res;
    }

}
