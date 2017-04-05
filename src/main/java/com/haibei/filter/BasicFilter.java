package com.haibei.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
public class BasicFilter implements Filter {

    public void destroy() {

    }

    public void doFilter(ServletRequest servletRequest,  ServletResponse servletResponse, FilterChain filterchain)
			throws IOException, ServletException {

     HttpServletResponse response = (HttpServletResponse) servletResponse;

 

//ָ������������������  

 response.addHeader("Access-Control-Allow-Origin", "*");

//2 ��Ӧ����  ��Ӧ����

 response.addHeader("Access-Control-Allow-Methods", "POST,GET,OPTIONS"); 

   // ��Ӧͷ���� 

 response.addHeader("Access-Control-Allow-Headers", "POWERED-BY-FANTONG");

 response.addHeader("Access-Control-Max-Age", "30");   
 
 
 // ��Ҫ���˵Ĵ���
 filterchain.doFilter(servletRequest, servletResponse);
}

    public void init(FilterConfig config) throws ServletException {

    }
}
