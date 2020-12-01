package com.bjpowernode.entity;

/**
 * @author XUN~MLF
 */
public class Users {
    private int userId;
    private String userName;
    private String password;
    private String sex;
    private String email;

    public Users( String userName, String password, String sex, String email) {

        this.userName = userName;
        this.password = password;
        this.sex = sex;
        this.email = email;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
