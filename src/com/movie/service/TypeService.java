package com.movie.service;

import com.movie.dao.TypeMapper;

import java.util.List;

public class TypeService {
    private TypeMapper mapper=new TypeMapper();

    public List<String> getYear() {
        return mapper.getYear();
    }

    public List<String> getType() {
        return mapper.getType();
    }

    public List<String> getArea() {
        return mapper.getArea();
    }
}
