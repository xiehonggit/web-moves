package com.movie.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.movie.service.TypeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/getArea")
public class getAreaServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/json;charset=utf-8");
        TypeService typeService=new TypeService();
        List<String> year = typeService.getArea();
        ObjectMapper objectMapper=new ObjectMapper();;
        resp.getWriter().write(objectMapper.writeValueAsString(year));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}
