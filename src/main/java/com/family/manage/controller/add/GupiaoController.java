package com.family.manage.controller.add;

import com.alibaba.fastjson.JSONObject;
import com.family.manage.entity.Bank;
import com.family.manage.entity.Gupiao;
import com.family.manage.entity.User;
import com.family.manage.service.User.GupiaoService;
import com.family.manage.service.User.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
public class GupiaoController {

    @Resource
    private GupiaoService gupiaoService;

    @Resource
    private UserService userService;


    @RequestMapping("/page/gupiao/add")
    public ModelAndView gupiao(HttpSession session){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/table/gupiaoadd");
        return  modelAndView;
    }


    @RequestMapping("/gupiao/insert")
    public String insert(HttpSession session, Gupiao gupiao){
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

        gupiao.setUid(admin.getId());
        gupiaoService.insert(gupiao);
        JSONObject object = new JSONObject();
        object.put("flag",1);
        return object.toString();
    }
}
