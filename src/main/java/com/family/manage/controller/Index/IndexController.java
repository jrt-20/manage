package com.family.manage.controller.Index;

import com.alibaba.fastjson.JSONObject;
import com.family.manage.entity.*;
import com.family.manage.service.User.BankService;
import com.family.manage.service.User.GupiaoService;
import com.family.manage.service.User.HouseService;
import com.family.manage.service.User.UserService;
import com.family.manage.service.family.FamilyService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {

    @Resource
    private UserService userService;
    @Resource
    private FamilyService familyService;

    @Resource
    private BankService bankService;

    @Resource
    private GupiaoService gupiaoService;

    @Resource
    private HouseService houseService;

    @RequestMapping("/index")
    public ModelAndView index(HttpSession session){
        User user = (User) session.getAttribute("user");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/index");
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
        }
        modelAndView.addObject("users",user);
        return modelAndView;
    }

    @RequestMapping("/page/welcome1")
    public ModelAndView pageWelcome1(HttpSession session){
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
        Family family = familyService.selectByUid(user.getId());

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("familyInfo",family);

        List<Family> familyList = familyService.selectByFid(family.getFid());
        List<User> users = new ArrayList<>();
        for (Family elem:
             familyList) {
            User u = userService.selectByUid(elem.getUid());
            users.add(u);
        }
        modelAndView.addObject("peoplesNum",familyList.size());
        modelAndView.addObject("familyMembers",users);

        List<Bank> banks = bankService.selectByUid(user.getId());
        modelAndView.addObject("bankNums",banks.size());

        List<Gupiao> gupiaos = gupiaoService.selectByUid(user.getId());
        modelAndView.addObject("gupiaoNums",gupiaos.size());

        List<Houses> houses = houseService.selectByUid(user.getId());
        modelAndView.addObject("houseNums",houses.size());

        modelAndView.setViewName("/welcome1");
        return modelAndView;
    }

    @RequestMapping("/api/chartData")
    @ResponseBody
    public String chart(HttpSession session){
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
        System.out.println("data:"+user.toString());
        List<Double> res = new ArrayList<>();
        List<Gupiao> gupiaos = gupiaoService.selectByUid(user.getId());
        Double gupiaoRes = 0.0;
        for (Gupiao g:
             gupiaos) {
            gupiaoRes+=g.getGvalue();
        }
        res.add(gupiaoRes);

        List<Bank> banks = bankService.selectByUid(user.getId());
        Double bankRes = 0.0;
        for (Bank b:
             banks) {
            bankRes+=b.getMoney();
        }
        res.add(bankRes);
        JSONObject object = new JSONObject();
        object.put("chartsData",res);
        return  object.toString();
    }

    @RequestMapping("/api/chartData2")
    @ResponseBody
    public String chart2(HttpSession session){
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
        // 获取家庭信息
        Family family = familyService.selectByUid(user.getId());
        List<Family> familyList = familyService.selectByFid(family.getFid());
        List<User> users = new ArrayList<>();
        for (Family elem:
                familyList) {
            User u = userService.selectByUid(elem.getUid());
            users.add(u);
        }

        List<Double> banks = new ArrayList<>();
        List<Double> gupiaos = new ArrayList<>();
        List<String> names = new ArrayList<>();
        for (User u:
                users) {
            banks.add(getBanks(u.getId()));
            gupiaos.add(getGuPiao(u.getId()));
            names.add(u.getUsername());
        }

        JSONObject object = new JSONObject();
        object.put("names",names);
        object.put("banks",banks);
        object.put("gupiaos",gupiaos);
        return  object.toString();
    }



    @RequestMapping("/page/welcome2")
    public ModelAndView pageWelcome2(HttpSession session){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/welcome2");
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
        // 获取家庭信息
        Family family = familyService.selectByUid(user.getId());
        List<Family> familyList = familyService.selectByFid(family.getFid());
        List<User> users = new ArrayList<>();
        for (Family elem:
                familyList) {
            User u = userService.selectByUid(elem.getUid());
            users.add(u);
        }

        modelAndView.addObject("userBanks",getBanks(user.getId()));
        modelAndView.addObject("userGupiaos",getGuPiao(user.getId()));
        Double familyBanks = 0.0,familyGupiaos = 0.0;
        for (User u:
             users) {
                familyBanks+=getBanks(u.getId());
                familyGupiaos+=getGuPiao(u.getId());

        }

        modelAndView.addObject("familyBanks",familyBanks);
        modelAndView.addObject("familyGupiaos",familyGupiaos);

        return modelAndView;
    }

    public Double getBanks(Integer uid){
        List<Bank> banks = bankService.selectByUid(uid);
        Double res = 0.0 ;
        for (Bank bank:
             banks) {
            res+=bank.getMoney();
        }
        return  res;
    }

    public Double getGuPiao(Integer uid){
        List<Gupiao> gupiaos = gupiaoService.selectByUid(uid);
        Double res = 0.0 ;
        for (Gupiao gupiao:gupiaos) {
            res+=gupiao.getGvalue();
        }
        return  res;
    }

    @RequestMapping("/page/welcome3")
    public ModelAndView pageWelcome3(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/welcome3");
        return modelAndView;
    }

    @RequestMapping("/")
    public ModelAndView home(HttpSession session){
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

        Family family = familyService.selectByUid(user.getId());

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("familyInfo",family);

        List<Family> familyList = familyService.selectByFid(family.getFid());
        List<User> users = new ArrayList<>();
        for (Family elem:
                familyList) {
            User u = userService.selectByUid(elem.getUid());
            users.add(u);
        }

        modelAndView.addObject("users",user);
        modelAndView.addObject("peoplesNum",familyList.size());
        modelAndView.addObject("familyMembers",users);

        modelAndView.setViewName("/index");
        return modelAndView;
    }


}
