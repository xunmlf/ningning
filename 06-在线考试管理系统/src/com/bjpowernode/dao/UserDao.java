package com.bjpowernode.dao;

import com.bjpowernode.entity.Users;
import com.bjpowernode.util.JDBCutil;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * @author XUN~MLF
 */
public class UserDao {
    private JDBCutil util = new JDBCutil();

    public boolean add(Users user)  {
            int count =0;
            try {
                Connection conn = JDBCutil.getConnection();
                String sql = "insert into users(userName,password,sex,email) values(?,?,?,?)";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, user.getUserName());
                ps.setString(2, user.getPassword());
                ps.setString(3, user.getSex());
                ps.setString(4, user.getEmail());
                count = ps.executeUpdate();
            }catch (Exception e) {
                e.printStackTrace();
            }
                if (count==0){
                    return  false;
                }else {
                    return  true;
                }
            }
    }

