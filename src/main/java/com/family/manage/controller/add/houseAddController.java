package com.family.manage.controller.add;

import com.alibaba.fastjson.JSONObject;
import com.family.manage.entity.Bank;
import com.family.manage.entity.Houses;
import com.family.manage.entity.User;
import com.family.manage.service.User.HouseService;
import com.family.manage.service.User.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
public class houseAddController {

    @Resource
    private HouseService houseService;

    @Resource
    private UserService userService;

    @RequestMapping("/page/house/add")
    public ModelAndView house(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/table/houseadd");
        return modelAndView;
    }


    @RequestMapping("/house/insert")
    public String insert(HttpSession session, Houses houses){
        User admin = (User) session.getAttribute("user");
        if(admin!=null){//如果用户已经登录了
            List<User> users = userService.selectAll(admin.getUsername());
            for (User u:
                    users) {
                admin.setId(u.getId());
                admin.setRole(u.getRole());
                admin.setGender(u.getGender());
                admin.setMobile(u.getMobile());
                admin.setJob(u.getJob());
                admin.setMsg(u.getMsg());
                admin.setUidcard(u.getUidcard());
            }
        }else{
            admin.setId(1);//默认为1
        }

        houses.setUid(admin.getId());
        Date date = new Date(System.currentTimeMillis());
        java.sql.Date date1 = new java.sql.Date(date.getTime());
        houses.setBugtime(date1);
        houses.setHetong("/layui/images/img.png");
        houses.setZhengming("/layui/images/img.png");
        houseService.insert(houses);

        JSONObject object = new JSONObject();
        object.put("flag",1);
        return object.toString();
    }
}
