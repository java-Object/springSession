package com.lq.spring_session.servlet;

import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Luo
 * @date 2021/1/5 19:46
 * @Package com.lq.spring_session.servlet
 * class springSession 入门案例、获取
 */
@WebServlet("/getServlet")
public class GetSessionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        //获取session中的值
        String url = (String) req.getSession().getAttribute("url");
        resp.getWriter().write(url==null ? "Null Session" : url);


    }
}
