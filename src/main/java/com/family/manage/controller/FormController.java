package com.family.manage.controller;

import com.alibaba.fastjson.JSONObject;
import com.family.manage.entity.Bank;
import com.family.manage.entity.User;
import com.family.manage.service.User.BankService;
import com.family.manage.service.User.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class FormController {

    @Resource
    private UserService userService;

    @Resource
    private BankService bankService;

    @RequestMapping("/page/form")
    public ModelAndView pageForm(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/form");
        return modelAndView;
    }

    @RequestMapping("/page/formStep")
    public ModelAndView pageFormStep(HttpSession session){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/formStep");

        User user = (User) session.getAttribute("user");
        if(user!=null){//如果用户已经登录了
            List<User> users = userService.selectAll(user.getUsername());
            for (User u:
                    users) {
                user.setId(u.getId());
                user.setRole(u.getRole());
                user.setGender(u.getGender());
                user.setMobile(u.getMobile());
                user.setJob(u.getJob());
                user.setMsg(u.getMsg());
                user.setUidcard(u.getUidcard());
            }
            System.out.println(user.toString());
        }else{
            user.setId(1);//默认为1

        }
        modelAndView.addObject("user",user);

        List<Bank> banks = bankService.selectByUid(user.getId());
        modelAndView.addObject("banks",banks);
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping("/page/add/{bid}/{moneyIn}")
    public String MoneyIn(@PathVariable("bid")Integer bid,@PathVariable("moneyIn") Double moneyIn,HttpSession session){
        User user = (User) session.getAttribute("user");
        if(user!=null){//如果用户已经登录了
            List<User> users = userService.selectAll(user.getUsername());
            for (User u:
                    users) {
                user.setId(u.getId());
                user.setRole(u.getRole());
                user.setGender(u.getGender());
                user.setMobile(u.getMobile());
                user.setJob(u.getJob());
                user.setMsg(u.getMsg());
                user.setUidcard(u.getUidcard());
            }
            System.out.println(user.toString());
        }else{
            user.setId(1);//默认为1

        }
        bankService.moneyIn(bid,user.getId(),moneyIn);
        JSONObject object = new JSONObject();
        object.put("msg","添加成功");
        object.put("code",0);
        return  object.toString();
    }



}
