package com.lfs.controller;

import com.lfs.entity.SysUsers;
import com.mongodb.dao.OperationLogDao;
import com.mongodb.entity.OperationLog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2017/12/15.
 */
@Controller
@Slf4j
public class HelloController {

    @Autowired
    private OperationLogDao operationLogDao;

    @RequestMapping("/page/{viewName}")
    public ModelAndView showView(@PathVariable String viewName){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName(viewName);
        return modelAndView;
    }

    @RequestMapping(value = "/loginError")
    public String loginError(Model model) {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("errorMsg", "用户名或者密码错误!");
        resultMap.put("success", false);
        model.addAllAttributes(resultMap);
        return "/login";
    }

    @RequestMapping(value = "/loginSuccess")
    public String loginSuccess(Model model) {
        SysUsers userDetails = (SysUsers) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        log.info("登录用户:"+userDetails.getLoginName());
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("userInfo", userDetails);
        resultMap.put("success", true);
        model.addAllAttributes(resultMap);
        return "/home";
    }

    @RequestMapping(value="/logout", method = RequestMethod.GET)
    public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
        Map<String,Object> returnMap = new HashMap<String,Object>();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        SysUsers userDetails = (SysUsers) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (auth != null){
            new SecurityContextLogoutHandler().logout(request, response, auth);
            log.info("用户登出:"+userDetails.getLoginName());
            returnMap.put("success",true);
        }
        return "/login";
    }
}
