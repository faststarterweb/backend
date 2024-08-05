package org.faststarter.com.api.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;


public class DefaultWebMvcInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return auth(request, response);
    }

    private boolean auth(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return true;
    }

}
