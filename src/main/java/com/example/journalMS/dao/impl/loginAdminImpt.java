package com.example.journalMS.dao.impl;

import com.example.journalMS.dao.loginAdminDao;
import com.example.journalMS.domain.admin;
import com.example.journalMS.domain.user;
import com.example.journalMS.util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class loginAdminImpt implements loginAdminDao {

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
    public void save(admin adm) {
        String sql = "insert into admin(useName,passWord,lastLogin) values (?,?,?)";
        this.executeUpdate(sql, adm.getUsename(), adm.getPassword(), adm.getLastLogin());
    }

    @Override
    public void delete(String useName) {
        String sql = "delete from admin where useName = ?";
        this.executeUpdate(sql, useName);
    }

    @Override
    public void update(String useName, admin adm) {
        String sql = "update admin set useName=?,passWord=?,lastLogin=? where useName = ?";
        this.executeUpdate(sql, adm.getUsename(), adm.getPassword(), adm.getLastLogin(), useName);
    }

    @Override
    public admin get(String useName) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            // 1.加载驱动
            // 2.连接数据库
            conn = JdbcUtil.getConn();
            // 3.创建语句
            String sql = "select * from admin where useName = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, useName);
            // 4.执行语句
            rs = ps.executeQuery();
            if (rs.next()) {
                admin adm = new admin(rs.getString("useName"),rs.getString("passWord"),
                        rs.getString("lastLogin"));
                return adm;
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
    public List<admin> getAll() {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            // 1.加载驱动
            // 2.连接数据库
            conn = JdbcUtil.getConn();
            // 3.创建语句
            st = conn.createStatement();
            String sql = "select * from admin ";
            System.out.println(sql);
            // 4.执行语句
            rs = st.executeQuery(sql);
            // 创建一个集合
            List<admin> list = new ArrayList<admin>();
            while (rs.next()) {
                admin adm = new admin(
                        rs.getString("useName"),
                        rs.getString("passWord"),
                        rs.getString("loginTime"));
                list.add(adm);
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
