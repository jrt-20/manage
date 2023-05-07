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
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class LoginController {

    @Resource
    private UserService userService;

    @Resource
    private FamilyService familyService;

    @RequestMapping("/page/login1")
    public ModelAndView login1(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/login1");
        return  modelAndView;
    }

    @RequestMapping("/page/login2")
    public ModelAndView login2(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/login2");
        return  modelAndView;
    }

    /**
     * 登录接口
     * @param username 前端传递的username
     * @param password 前端传递的password
     * @param session 登录成功后用session保存user对象
     * @param modelAndView 返回结果
     * @return
     */
    @ResponseBody
    @RequestMapping("/login2/{username}/{psw}/{sname}")
    public String Login(@PathVariable("username") String username, @PathVariable("psw")String password, @PathVariable("sname")String sname, HttpSession session, ModelAndView modelAndView){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        System.out.println(user.toString());
        int flag = userService.login(user);
        session.setAttribute("user",user);
        JSONObject object = new JSONObject();
        modelAndView.addObject("user",user);

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
        if(users.size()==0||flag==0){
            flag = 0;
            object.put("flag",flag);
            return object.toString();
        }
        Family family = familyService.selectByUid(user.getId());
        if(family.getFname().equals(sname)){
            flag = 2;
        }
        if(flag==1){
            object.put("url","/index");
        }else if(flag==0){
            object.put("url","/login");
        }
        object.put("flag",flag);
        return object.toString();
    }


    /**
     * 退出登录
     * @param session 用来删除session中存储的user对象
     * @return
     */
    @RequestMapping("/loginOut")
    public ModelAndView LoginOut(HttpSession session){
        session.removeAttribute("user");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/login1");
        return modelAndView;
    }


    @RequestMapping("/page/password")
    public ModelAndView modify(HttpSession session){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/user-password");
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping("/psw/{password}")
    public String psw(@PathVariable("password")String password, HttpSession session) {
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
        userService.update(user.getId(),password);
        JSONObject object = new JSONObject();
        object.put("flag",1);
        return object.toString();
    }
}

