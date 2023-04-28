package com.family.manage.controller.Info;

import com.alibaba.fastjson.JSONObject;
import com.family.manage.entity.Houses;
import com.family.manage.entity.User;
import com.family.manage.service.User.HouseService;
import com.family.manage.service.User.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class HouseController {

    @Resource
    private HouseService houseService;

    @Resource
    private UserService userService;
    @RequestMapping("/page/house")
    public ModelAndView house(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/house");
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping("/page/HouseJSON")
    public String HouseJSON(HttpSession session){
        JSONObject object = new JSONObject();
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
        }else{
            user.setId(1);//默认为1
        }
        List<Houses> data = houseService.selectByUid(user.getId());
        object.put("count",data.size());
        object.put("data",data);
        object.put("msg","查询成功");
        object.put("code",0);
        return object.toString();
    }
}
