package com.family.manage.controller.add;

import com.alibaba.fastjson.JSONObject;
import com.family.manage.entity.Bank;
import com.family.manage.entity.Family;
import com.family.manage.entity.User;
import com.family.manage.service.User.BankService;
import com.family.manage.service.User.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
public class bankAddController {

    @Resource
    private BankService bankService;
    @Resource
    private UserService userService;

    @RequestMapping("/page/bank/add")
    public ModelAndView bank(HttpSession session){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/table/bankadd");
        return modelAndView;
    }


    @RequestMapping("/bank/insert")
    public String insert(HttpSession session, Bank bank){
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
                admin.setName(u.getName());
            }
        }else{
            admin.setId(1);//默认为1
        }

        bank.setUid(admin.getId());
        bank.setName(admin.getName());
        Date currentTime = new Date(System.currentTimeMillis());
        java.sql.Date date = new java.sql.Date(currentTime.getTime());
        bank.setCreatetime(date);

        System.out.println(bank.toString());

        bankService.insert(bank);

        JSONObject object = new JSONObject();
        object.put("flag",1);
        return object.toString();
    }

}
