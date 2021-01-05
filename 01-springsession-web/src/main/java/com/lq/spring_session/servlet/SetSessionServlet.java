package com.lq.spring_session.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Luo
 * @date 2021/1/5 19:33
 * @Package com.lq.spring_session.servlet
 * class    springSession 入门案例、存
 */
@WebServlet(urlPatterns = "/setSession")
public class SetSessionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);

        req.getSession().setAttribute("user","http://www.baidu.com");
        resp.getWriter().write("spring session OK!");
    }
}
