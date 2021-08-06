package cn.edu.guet.controller;

import cn.edu.guet.bean.User;
import cn.edu.guet.bll.IMyRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author George
 * @project gytht
 * @package cn.edu.guet.controller
 * @date 2021/8/5 16:23
 * @since 1.0
 */
@Controller
@ResponseBody
public class MyRecordController {
    @Autowired
    private IMyRecordService myRecordService;

    @GetMapping("/getUsername")
    public String getUsername(){
        List<User> userList= myRecordService.getUser();
        String name=userList.get(0).getUsername();
        return name;
    }
}
