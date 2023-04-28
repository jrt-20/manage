package com.family.manage.controller.User;

import com.alibaba.fastjson.JSONObject;
import com.family.manage.entity.Family;
import com.family.manage.entity.User;
import com.family.manage.service.User.UserService;
import com.family.manage.service.family.FamilyService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;
import java.util.Random;

@Controller
public class RegisterController {

    @Resource
    private UserService userService;

    @Resource
    private FamilyService familyService;

    @RequestMapping("/page/register")
    public ModelAndView register(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/register");
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping("/register/{fname}")
    public String re(@PathVariable("fname") String fname,User user){
        System.out.println(user.toString());
        System.out.println(fname);
        user.setRole(1);
        user.setGender(1);
        userService.insert(user);
        List<User> users = userService.selectAll(user.getUsername());
        for (User u:
             users) {
            user.setId(u.getId());
        }
        Family family = new Family();
        family.setFname(fname);
        family.setUid(user.getId());
        family.setFid(new Random().nextInt(99)+10);
        familyService.insert(family);
        JSONObject object = new JSONObject();
        object.put("flag",1);
        return  object.toString();
    }
}
