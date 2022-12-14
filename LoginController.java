package com.controller;

import com.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/login")
public class LoginController {
    @RequestMapping("/test")
    public String getiLoginService() {
        return "login";
    }

    @Autowired
    private ILoginService iLoginService;

    @RequestMapping("/mlogin")
    public ModelAndView login(HttpServletRequest request){

        String userName = request.getParameter("userName");
        String passWord = request.getParameter("passWord");
        System.out.println("用户名" + userName + "密码" + passWord);
        boolean loginStatue= iLoginService.login(userName,passWord);
//        if(loginStatue)
//            return "success";
//        else
//            return "login";
        String message = loginStatue ? "登录成功" : "登入失败!请重新登入";

        request.setAttribute("loginStatue",message);

        return new ModelAndView("success");
    }
}
