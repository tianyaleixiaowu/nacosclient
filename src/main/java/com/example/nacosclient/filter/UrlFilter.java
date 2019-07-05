package com.example.nacosclient.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * 加统一的前缀
 * @author wuweifeng wrote on 2018/11/1.
 */
public class UrlFilter implements Filter {


    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        //HttpServletRequest httpRequest = (HttpServletRequest) request;
        //
        //String path = httpRequest.getRequestURI();
        //if (path.contains("/nacosclient")) {
        //    path = path.replace("/nacosclient", "");
        //    httpRequest.getRequestDispatcher(path).forward(httpRequest, response);
        //}

    }
}