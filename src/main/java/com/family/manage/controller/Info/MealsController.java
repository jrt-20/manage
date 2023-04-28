package com.family.manage.controller.Info;

import com.alibaba.fastjson.JSONObject;
import com.family.manage.entity.Family;
import com.family.manage.entity.Gupiao;
import com.family.manage.entity.User;
import com.family.manage.service.User.GupiaoService;
import com.family.manage.service.User.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MealsController {

    @Resource
    private UserService userService;

    @Resource
    private GupiaoService gupiaoService;

    @RequestMapping("/page/menu")
    public ModelAndView pageMenu(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/menu");
        return  modelAndView;
    }

    @RequestMapping("/page/gupiao")
    public ModelAndView pageGU(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/gupiao");
        return  modelAndView;
    }

    @ResponseBody
    @RequestMapping("/page/GupiaoJSON")
    public String GupiaoJSON(HttpSession session){
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
        List<Gupiao> data = gupiaoService.selectByUid(user.getId());
        object.put("count",data.size());
        object.put("data",data);
        object.put("msg","查询成功");
        object.put("code",0);
        return object.toString();
    }

}
