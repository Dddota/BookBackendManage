package com.bdqn.controller;

import com.bdqn.entity.UserInfo;
import com.bdqn.service.UserInfoService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * @ClassName com.bdqn.controller
 * @Description
 * @Author Liuying[albertliuy@foxmail.com]
 * @Date 2018/5/19 14:10
 */
@Log
@Controller
public class UserController {
    @Autowired
    UserInfoService userInfoService;

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String showUser(){
        return "/User/userlist";
    }


    @RequestMapping(value = "/userreg",method = RequestMethod.GET)
    public String preuserReg(@ModelAttribute("userInfo") UserInfo userInfo){
        return "/JSP/User/userReg";
    }

    @RequestMapping(value = "/userreg",method = RequestMethod.POST)
    public String userReg(@Valid @ModelAttribute("userInfo") UserInfo userInfo, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            log.info("出现错误" + bindingResult.toString());
            return "/userreg";
        }else {
            return "redirect:User/userlist";
        }

    }
}
