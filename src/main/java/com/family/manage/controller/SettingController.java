package com.family.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SettingController {

    @RequestMapping("/page/setting")
    public ModelAndView pageSetting(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/setting");
        return  modelAndView;
    }
}
