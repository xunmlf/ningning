package com.bjpowernode.controller;

import com.bjpowernode.dao.UserDao;
import com.bjpowernode.entity.Users;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author XUN~MLF
 */
public class UserAddServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String  userName,password,sex,email;
        UserDao dao=new UserDao();
        Users user = null;
        PrintWriter out=null;

        //1:调用请求对象，读取请求头中的参数信息，得到用户的信息

        userName= request.getParameter("userName");
        password = request.getParameter("pwd");
        sex = request.getParameter("sex");
        email = request.getParameter("email");
        System.out.println(userName+","+password+","+sex+","+email);
        //2:通过JDBC规范发送到数据库服务器
        user=new Users(userName,password,sex,email);
        boolean flag = dao.add(user);

        //3:调用响应体，将处理结果以二进制形式写入到响应体中。
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        out=response.getWriter();
        if (flag){
            out.print("<font style='color:red;font-size:40px'>用户信息注册成功</font>");
        }else {
            out.print("<font style='color:red;font-size:40px'>用户信息注册失败</font>");
        }

    }
}
