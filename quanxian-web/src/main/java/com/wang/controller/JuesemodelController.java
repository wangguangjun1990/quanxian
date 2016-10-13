package com.wang.controller;

import com.wang.service.JuesemodelService;
import com.wang.vo.JuesemodelVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2016/10/13.
 */
@Controller
public class JuesemodelController {
    @Autowired
    private JuesemodelService juesemodelService;

    @RequestMapping("/tozhuye")
    public String zhuye(HttpSession session,ModelMap modelMap){
       Integer j=(Integer)session.getAttribute("jsid");

        List<JuesemodelVo> list= juesemodelService.findbyid(j);
        if(list!=null) {
            modelMap.put("list", list);
            return "zhuye";
        }
        else
            return "redirect:/index.html";

    }
}
