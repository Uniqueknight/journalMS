package com.example.journalMS.dao.impl;

import com.example.journalMS.dao.jourUserDao;
import com.example.journalMS.domain.jourUser;
import com.example.journalMS.domain.user;
import com.example.journalMS.util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class jourUserDaoImpt implements jourUserDao {


    public int executeUpdate(String sql, Object... params) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            // 1.????????
            // 2.?????????
            conn = JdbcUtil.getConn();
            // 3.???????
            ps = conn.prepareStatement(sql);
            // ????????
            for (int i = 0; i < params.length; i++) {
                // ps.setString(1, stu.getName());
                // ps.setInt(2, stu.getAge());
                ps.setObject(i + 1, params[i]);

            }
            // 4.??????
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 5.??????
            JdbcUtil.close(conn, ps, null);
        }
        return 0;
    }


    @Override
    public void save(jourUser jusr) {
        String sql = "insert into jourUser(jourName,userName,num) values (?,?,?)";
        this.executeUpdate(sql, jusr.getJourName(), jusr.getUserName(),jusr.getUserName());
    }

    @Override
    public void delete(String jourName,String userName) {
        String sql = "delete from jourUser where jourName = ? and userName = ?";
        this.executeUpdate(sql, jourName,userName);
    }

    @Override
    public void update(String jourName, String userName , jourUser jusr) {
        String sql = "update jourUser set jourName=?,userName=?,num = ? where jourName = ? and userName = ?";
        this.executeUpdate(sql, jusr.getJourName(), jusr.getUserName(), jusr.getNum(),jourName,userName);
    }

    @Override
    public jourUser get(String jourName , String userName) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            // 1.????????
            // 2.?????????
            conn = JdbcUtil.getConn();
            // 3.???????
            String sql = "select * from jouruser where jourName = ? and userName = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, jourName);
            ps.setString(2, userName);
            // 4.??????
            rs = ps.executeQuery();
            if (rs.next()) {
                jourUser jusr = new jourUser(rs.getString("jourName"),rs.getString("userName"),
                        rs.getString("num"));
                return jusr;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 5.??????
            JdbcUtil.close(conn, ps, rs);
        }
        return null;
    }

    @Override
    public List<jourUser> getAll() {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            // 1.????????
            // 2.?????????
            conn = JdbcUtil.getConn();
            // 3.???????
            st = conn.createStatement();
            String sql = "select * from jouruser ";
            System.out.println(sql);
            // 4.??????
            rs = st.executeQuery(sql);
            // ???????????
            List<jourUser> list = new ArrayList<jourUser>();
            while (rs.next()) {
                jourUser jusr = new jourUser(
                        rs.getString("jourName"),
                        rs.getString("userName"),
                        rs.getString("num"));
                list.add(jusr);
            }
            return list;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(conn, st, rs);
        }
        return null;
    }

    public boolean existX(String jourName,String userName){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = JdbcUtil.getConn();
            String sql = "select * from jouruser where jourName = ? and userName = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,jourName);
            ps.setString(2, userName);
            rs = ps.executeQuery();
            if (rs.next())
                return true;
            else
                return false;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 5.??????
            JdbcUtil.close(conn, ps, rs);
        }

        return false;
    }



}
