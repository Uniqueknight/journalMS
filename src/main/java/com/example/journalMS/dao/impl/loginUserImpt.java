package com.example.journalMS.dao.impl;

import com.example.journalMS.dao.loginUserDao;
import com.example.journalMS.domain.user;
import com.example.journalMS.util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class loginUserImpt implements loginUserDao {

    public int executeUpdate(String sql, Object... params) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            // 1.加载驱动
            // 2.连接数据库
            conn = JdbcUtil.getConn();
            // 3.创建语句
            ps = conn.prepareStatement(sql);
            // 遍历参数
            for (int i = 0; i < params.length; i++) {
                // ps.setString(1, stu.getName());
                // ps.setInt(2, stu.getAge());
                ps.setObject(i + 1, params[i]);

            }
            // 4.执行语句
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 5.释放资源
            JdbcUtil.close(conn, ps, null);
        }
        return 0;
    }


    @Override
    public void save(user usr) {
        String sql = "insert into user(useName,passWord,loginTime) values (?,?,?)";
        this.executeUpdate(sql, usr.getUseName(), usr.getPassWord(), usr.getLoginTime());
    }

    @Override
    public void delete(String useName) {
        String sql = "delete from user where useName = ?";
        this.executeUpdate(sql, useName);
    }

    @Override
    public void update(String useName, user usr) {
        String sql = "update user set useName=?,passWord=?,loginTime=? where useName = ?";
        this.executeUpdate(sql, usr.getUseName(), usr.getPassWord(), usr.getLoginTime(), useName);
    }

    @Override
    public user get(String useName) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            // 1.加载驱动
            // 2.连接数据库
            conn = JdbcUtil.getConn();
            // 3.创建语句
            String sql = "select * from user where useName = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, useName);
            // 4.执行语句
            rs = ps.executeQuery();
            if (rs.next()) {
                user usr = new user(rs.getString("useName"),rs.getString("passWord"),
                        rs.getString("loginTime"));
                return usr;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 5.释放资源
            JdbcUtil.close(conn, ps, rs);
        }
        return null;
    }

    @Override
    public List<user> getAll() {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            // 1.加载驱动
            // 2.连接数据库
            conn = JdbcUtil.getConn();
            // 3.创建语句
            st = conn.createStatement();
            String sql = "select * from user ";
            System.out.println(sql);
            // 4.执行语句
            rs = st.executeQuery(sql);
            // 创建一个集合
            List<user> list = new ArrayList<user>();
            while (rs.next()) {
                user usr = new user(
                        rs.getString("useName"),
                        rs.getString("passWord"),
                        rs.getString("loginTime"));
                list.add(usr);
            }
            return list;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(conn, st, rs);
        }
        return null;
    }
}
