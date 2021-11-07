package com.example.journalMS.dao.impl;

import com.example.journalMS.dao.userInfoDao;
import com.example.journalMS.domain.user;
import com.example.journalMS.domain.userInfo;
import com.example.journalMS.util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class userInfoDaoImpt implements userInfoDao {

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
    public void save(userInfo uInfo) {
        String sql = "insert into userInfo(userName,passWord,sex,email,phone,city,age) values (?,?,?,?,?,?,?)";
        this.executeUpdate(sql, uInfo.getUserName(), uInfo.getPassWord(), uInfo.getSex(),uInfo.getEmail(),uInfo.getPhone(),uInfo.getCity(),uInfo.getAge());
    }

    @Override
    public void delete(String userName) {
        String sql = "delete from userInfo where userName = ?";
        this.executeUpdate(sql, userName);
    }

    @Override
    public void update(String userName, userInfo uInfo) {
        String sql = "update userInfo set userName=?,passWord=?,sex=?,email=?,phone=?,city=?,age=? where userName = ?";
        this.executeUpdate(sql, uInfo.getUserName(), uInfo.getPassWord(), uInfo.getSex(), uInfo.getEmail(),uInfo.getPhone(),uInfo.getCity(),uInfo.getAge(),userName);
    }

    @Override
    public userInfo get(String userName) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            // 1.????????
            // 2.?????????
            conn = JdbcUtil.getConn();
            // 3.???????
            String sql = "select * from userinfo where userName = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, userName);
            // 4.??????
            rs = ps.executeQuery();
            if (rs.next()) {
                userInfo uInfo = new userInfo(
                        rs.getNString("userName"),
                        rs.getNString("passWord"),
                        rs.getNString("sex"),
                        rs.getNString("email"),
                        rs.getNString("phone"),
                        rs.getNString("city"),
                        rs.getNString("age"));
                return uInfo;
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
    public List<userInfo> getAll() {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            // 1.????????
            // 2.?????????
            conn = JdbcUtil.getConn();
            // 3.???????
            st = conn.createStatement();
            String sql = "select * from userinfo ";
            System.out.println(sql);
            // 4.??????
            rs = st.executeQuery(sql);
            // ???????????
            List<userInfo> list = new ArrayList<userInfo>();
            while (rs.next()) {
                userInfo uInfo = new userInfo(
                        rs.getNString("userName"),
                        rs.getNString("passWord"),
                        rs.getNString("sex"),
                        rs.getNString("email"),
                        rs.getNString("phone"),
                        rs.getNString("city"),
                        rs.getNString("age"));
                list.add(uInfo);
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
