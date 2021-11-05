package com.example.journalMS.dao.impl;

import com.example.journalMS.dao.loginAdminDao;
import com.example.journalMS.domain.admin;
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
            // 1.��������
            // 2.�������ݿ�
            conn = JdbcUtil.getConn();
            // 3.�������
            ps = conn.prepareStatement(sql);
            // ��������
            for (int i = 0; i < params.length; i++) {
                // ps.setString(1, stu.getName());
                // ps.setInt(2, stu.getAge());
                ps.setObject(i + 1, params[i]);

            }
            // 4.ִ�����
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 5.�ͷ���Դ
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
            // 1.��������
            // 2.�������ݿ�
            conn = JdbcUtil.getConn();
            // 3.�������
            String sql = "select * from admin where useName = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, useName);
            // 4.ִ�����
            rs = ps.executeQuery();
            if (rs.next()) {
                admin adm = new admin(rs.getString("useName"),rs.getString("passWord"),
                        rs.getString("lastLogin"));
                return adm;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 5.�ͷ���Դ
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
            // 1.��������
            // 2.�������ݿ�
            conn = JdbcUtil.getConn();
            // 3.�������
            st = conn.createStatement();
            String sql = "select * from admin ";
            System.out.println(sql);
            // 4.ִ�����
            rs = st.executeQuery(sql);
            // ����һ������
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

    @Override
    public boolean find(String useName, String passWord) {
        admin account = get(useName);
        if (account!=null&&account.getPassword().equals(passWord)){
            return true;
        }
        return false;



    }
}
