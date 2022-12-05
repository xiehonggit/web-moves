package com.movie.dao;

import com.movie.bean.User;
import com.movie.util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TypeMapper {
    public List<String> getYear() {
        String sql = "select * from str_year ";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<String> list=new ArrayList<>();
        try {
            conn = JdbcUtil.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(rs.getString("year"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtil.close(conn, ps, rs);
        }
        return list;
    }

    public List<String> getType() {
        String sql = "select * from str_type ";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<String> list=new ArrayList<>();
        try {
            conn = JdbcUtil.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(rs.getString("type"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtil.close(conn, ps, rs);
        }
        return list;
    }

    public List<String> getArea() {
        String sql = "select * from str_area ";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<String> list=new ArrayList<>();
        try {
            conn = JdbcUtil.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(rs.getString("area"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtil.close(conn, ps, rs);
        }
        return list;
    }
}
