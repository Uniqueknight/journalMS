package com.example.journalMS.dao.impl;

import com.example.journalMS.dao.journalDao;
import com.example.journalMS.domain.journal;
import com.example.journalMS.util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class journalDaoImpt implements journalDao {

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
    public void save(journal jour) {
        String sql = "insert into journal(jourName,jourNum,jourType,jourPrice,jourYear,jourPart) values (?,?,?,?,?,?)";
        this.executeUpdate(sql, jour.getJourName(), jour.getJourNum(), jour.getJourType(),jour.getJourPrice(),jour.getJourYear(),jour.getJourPart());
    }

    @Override
    public void delete(String jourName) {
        String sql = "delete from journal where jourName = ?";
        this.executeUpdate(sql, jourName);
    }

    @Override
    public void update(String jourName, journal jour) {
        String sql = "update journal set jourName=?,jourNum=?,jourType=?,jourPrice=?,jourYear=?,jourPart=? where jourName = ?";
        this.executeUpdate(sql,jour.getJourName(), jour.getJourNum(), jour.getJourType(),jour.getJourPrice(),jour.getJourYear(),jour.getJourPart(), jourName);
    }

    @Override
    public journal get(String useName) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            // 1.��������
            // 2.�������ݿ�
            conn = JdbcUtil.getConn();
            // 3.�������
            String sql = "select * from journal where jourName = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, useName);
            // 4.ִ�����
            rs = ps.executeQuery();
            if (rs.next()) {
                journal jour = new journal(
                        rs.getString("jourName"),
                        rs.getString("jourNum"),
                        rs.getString("jourType"),
                        rs.getString("jourPrice"),
                        rs.getString("jourYear"),
                        rs.getString("jourPart"));
                return jour;
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
    public List<journal> getAll() {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            // 1.��������
            // 2.�������ݿ�
            conn = JdbcUtil.getConn();
            // 3.�������
            st = conn.createStatement();
            String sql = "select * from journal ";
            System.out.println(sql);
            // 4.ִ�����
            rs = st.executeQuery(sql);
            // ����һ������
            List<journal> list = new ArrayList<journal>();
            while (rs.next()) {
                journal jour = new journal(
                        rs.getString("jourName"),
                        rs.getString("jourNum"),
                        rs.getString("jourType"),
                        rs.getString("jourPrice"),
                        rs.getString("jourYear"),
                        rs.getString("jourPart"));
                list.add(jour);
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
