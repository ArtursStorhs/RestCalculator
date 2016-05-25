package com.exigen.tst.web;

import com.exigen.tst.common.config.TstException;
import com.exigen.tst.common.config.TstUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.io.PrintWriter;


public class TstServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
    {
        String key = request.getParameter("key");
        TstUtil util = TstUtil.getInstance();
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        String value = null;
        try {
            value = util.getProperty(key);
            out.println(key +" = "+ value);
        }
        catch (TstException e) {
            out.println("key not found");
        }
    }

    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
    {
        doGet(request, response);
    }
}


