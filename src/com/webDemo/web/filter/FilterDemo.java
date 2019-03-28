package com.webDemo.web.filter;

import javax.servlet.*;
import java.io.IOException;


//@WebFilter("/*")
public class FilterDemo implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
//        System.out.println("init被执行了。。。");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        System.out.println("doFolter被执行了。。。");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

//        System.out.println("destory被执行了。。。");
    }
}
