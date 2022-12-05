package com.movie;

import com.movie.service.TypeService;

import java.util.List;

public class test1 {
    public static void main(String[] args) {
        TypeService typeService=new TypeService();
        List<String> year = typeService.getYear();
        System.out.println(year);
    }
}
