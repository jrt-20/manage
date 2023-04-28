package com.family.manage.controller;

import com.alibaba.fastjson.JSONObject;
import com.family.manage.entity.Family;
import com.family.manage.entity.User;
import com.family.manage.mapper.GupiaoMapper;
import com.family.manage.service.User.BankService;
import com.family.manage.service.User.GupiaoService;
import com.family.manage.service.User.UserService;
import com.family.manage.service.family.FamilyService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class TableController {

    @Resource
    private UserService userService;
    @Resource
    private FamilyService familyService;

    @Resource
    private BankService bankService;

    @Resource
    private GupiaoService gupiaoService;

    @RequestMapping("/page/table")
    public ModelAndView pageTable(HttpSession session){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/table");
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
        modelAndView.addObject("user",user);
        return  modelAndView;
    }

    @RequestMapping("/page/table/add")
    public ModelAndView pageTableAdd(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/table/add");
        return modelAndView;
    }

    @RequestMapping("/page/table/edit")
    public ModelAndView pageTableEdit(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/table/edit");
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping("/page/tableJSON")
    public String tableJSON(HttpSession session){
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
        Family family = familyService.selectByUid(user.getId());
        List<Family> familyList = familyService.selectByFid(family.getFid());
        List<User> users = new ArrayList<>();
        for (Family elem:
                familyList) {
            User u = userService.selectByUid(elem.getUid());
            users.add(u);
        }
        object.put("count",users.size());
        object.put("data",users);
        object.put("msg","查询成功");
        object.put("code",0);
        return object.toString();
    }

    /**
     * 根据id删除用户
     * @param id
     * @return
     */
    @RequestMapping("/table/delete/{id}")
    @ResponseBody
    public String delete(@PathVariable("id")Integer id){
         int flag = userService.delete(id);
         familyService.delete(id);
         bankService.deleteByUid(id);
         gupiaoService.delete(id);
         JSONObject object = new JSONObject();
         object.put("flag",flag);
         return object.toString();
    }

    /**
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/table/insert")
    public String insert(HttpSession session,User user){
        User admin = (User) session.getAttribute("user");
        if(user!=null){//如果用户已经登录了
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
        Family family = familyService.selectByUid(admin.getId());
        user.setRole(0);
        user.setGender(1);
        userService.insert(user);

        // 添加用户的补充信息
        if(user!=null){//如果用户已经登录了
            List<User> users = userService.selectAll(user.getUsername());
            for (User u:
                    users) {
                user.setId(u.getId());
            }
        }else{
            admin.setId(1);//默认为1
        }
        Family family1 = new Family();
        family1.setFid(family.getFid());
        family1.setUid(user.getId());
        family1.setFname(family.getFname());
        familyService.insert(family1);
        System.out.println("add"+user.toString());
        System.out.println("add"+family1.toString());
        JSONObject object = new JSONObject();
        object.put("flag",1);
        return object.toString();
    }


}
