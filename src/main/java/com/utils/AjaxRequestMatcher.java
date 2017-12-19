package com.utils;

import org.springframework.security.web.util.matcher.RequestMatcher;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by ZhengL on 2017/11/27.
 */
public class AjaxRequestMatcher implements RequestMatcher {
    @Override
    public boolean matches(HttpServletRequest request) {
        return "XMLHttpRequest".equals(request.getHeader("X-Requested-With")) ||
                request.getHeader("Accept") != null &&
                        request.getHeader("Accept").contains("application/json");
    }
}
