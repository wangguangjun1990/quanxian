package com.wang.controller;

import com.wang.entity.User;
import com.wang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;


/**
 * Created by Administrator on 2016/10/13.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/check1")
     //根据name查找用户
    public String check1(@RequestParam("username") String username,@RequestParam("passward") String passward,HttpSession session){
           User user=userService.check(username,passward);
        if(user!=null){
            session.setAttribute("jsid",user.getJsid());
            return "redirect:/tozhuye";
        }
        else
            return "redirect:/index.html";

   }


}