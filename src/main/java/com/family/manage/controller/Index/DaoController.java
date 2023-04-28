package com.family.manage.controller.Index;

import com.alibaba.fastjson.JSONObject;
import com.family.manage.entity.Dao.Child;
import com.family.manage.entity.Dao.Childitem;
import com.family.manage.entity.Dao.Currency;
import com.family.manage.entity.Dao.MenuInfo;
import com.family.manage.entity.User;
import com.family.manage.service.User.UserService;
import com.family.manage.service.dao.DaoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class DaoController {
    @Resource
    private DaoService daoService;

    @Resource
    private UserService userService;

    @ResponseBody
    @RequestMapping("/init")
    public String init(HttpSession session){
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

        JSONObject res = new JSONObject();
//        clearInfo
        JSONObject clearInfo = new JSONObject();
        clearInfo.put("clearUrl","/layui/api/clear.json");
//        homeInfo
        JSONObject homeInfo = new JSONObject();
        homeInfo.put("title","首页");
        homeInfo.put("icon","fa fa-home");
        homeInfo.put("href","/page/welcome1");

//      logoInfo
        JSONObject logoInfo = new JSONObject();
        logoInfo.put("title","家庭财务管理");
        logoInfo.put("image","/layui/images/logo.png");
        logoInfo.put("href","");

        MenuInfo menuInfo = new MenuInfo();
        Currency currency = new Currency();
        currency.setTitle("首页");
        currency.setIcon("fa fa-home");
        currency.setChild(generator(user.getRole()));
        menuInfo.setCurrency(currency);

        res.put("clearInfo",clearInfo);
        res.put("homeInfo",homeInfo);
        res.put("logoInfo",logoInfo);
        res.put("menuInfo",menuInfo);
        return  res.toString();
    }

    public List<Child> generator(int role){
        List<Child> childList = new ArrayList<>();
        Child child1 = new Child();
        child1.setChild(daoService.selectAll());
        child1.setTitle("主页模板");
        child1.setHref("");
        child1.setIcon("fa fa-home");
        child1.setTarget("_self");
        childList.add(child1);

        Child child = new Child();
        child.setTitle("银行管理");
        child.setHref("/page/bank");
        child.setIcon("fa fa-window-maximize");
        child.setTarget("_self");
        childList.add(child);

        Child child2 = new Child();
        child2.setTitle("股票管理");
        child2.setHref("/page/gupiao");
        child2.setIcon("fa fa-window-maximize");
        child2.setTarget("_self");
        childList.add(child2);

        Child child5 = new Child();
        child5.setTitle("房产管理");
        child5.setHref("/page/house");
        child5.setIcon("fa fa-window-maximize");
        child5.setTarget("_self");
        childList.add(child5);



        Child child3 = new Child();
        child3.setTitle("成员管理");
        child3.setHref("/page/table");
        child3.setIcon("fa fa-file-text");
        child3.setTarget("_self");
        if(role==1) childList.add(child3);

        Child child4 = new Child();
        child4.setTitle("收支记录");
        child4.setHref("");
        child4.setIcon("fa fa-calendar");
        child4.setTarget("_self");

        List<Childitem> childitems4 = new ArrayList<>();
//        Childitem childitem41 = new Childitem();
//        childitem41.setTitle("普通表单");
//        childitem41.setHref("/page/form");
//        childitem41.setIcon("fa fa-list-alt");
//        childitem41.setTarget("_self");
//        childitems4.add(childitem41);

        Childitem childitem42 = new Childitem();
        childitem42.setTitle("交易管理");
        childitem42.setHref("/page/formStep");
        childitem42.setIcon("fa fa-navicon");
        childitem42.setTarget("_self");
        childitems4.add(childitem42);
        child4.setChild(childitems4);
        childList.add(child4);

//        Child child5 = new Child();
//        child5.setTitle("登录");
//        child5.setHref("");
//        child5.setIcon("fa fa-calendar");
//        child5.setTarget("_self");
//
//        List<Childitem> childitems5 = new ArrayList<>();
//        Childitem childitem51 = new Childitem();
//        childitem51.setTitle("登录-1");
//        childitem51.setHref("/page/login1");
//        childitem51.setIcon("fa fa-stumbleupon-circle");
//        childitem51.setTarget("_self");
//        childitems5.add(childitem51);
//
//        child5.setChild(childitems5);
//        childList.add(child5);

        return  childList;
    }
}
