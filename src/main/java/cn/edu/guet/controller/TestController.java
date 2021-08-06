package cn.edu.guet.controller;

import cn.edu.guet.bean.User;
import cn.edu.guet.bll.ITestService;
import cn.edu.guet.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author George
 * @project gytSptingboot-vue
 * @package cn.edu.guet.controller
 * @date 2021/8/4 10:06
 * @since 1.0
 */

/**
 * myBatis-plus测试控制器
 */
@Controller
public class TestController {
    @Autowired
    private ITestService testService;

    @GetMapping("/getUser")
    @ResponseBody
    public List<User> getUser(){

        List<User> list = testService.getUser();

        //循环获取用户数据
        for (User userTest:list){
            //获取用户名称
            System.out.println(userTest.getUsername());
        }
        return list;
    }
}
