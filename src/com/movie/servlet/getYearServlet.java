package com.movie.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/getYearSevlet")
public class getYearServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
        resp.setContentType("text/json;charset=utf-8");
        List<String> list=new ArrayList<>();
        list.add("2001");
        list.add("2002");
        list.add("2003");
        list.add("2004");
        ObjectMapper objectMapper=new ObjectMapper();
        System.out.println(list);
        resp.getWriter().write(objectMapper.writeValueAsString(list));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
