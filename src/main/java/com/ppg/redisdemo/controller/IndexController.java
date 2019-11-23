package com.ppg.redisdemo.controller;


import com.ppg.redisdemo.domain.User;
import com.ppg.redisdemo.job.QuartzManager;
import com.ppg.redisdemo.job.TestJob;
import com.ppg.redisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController   //RestController = controller + responsebody 不支持返回 页面
@Controller
@RequestMapping("/home")
public class IndexController {


    @Autowired
    private UserService userService;

    @Autowired
    private QuartzManager quartzManager;

    @RequestMapping("/index")
    @ResponseBody
    public String index(){
//        return "/home.ftl" ;
        System.out.println("111");

        String cron = "0/5 * * * * ?";

        quartzManager.addJob("job4test", TestJob.class,cron);

//        User user = userService.findOne("11");



        return "james harden!!!";
    }


}
