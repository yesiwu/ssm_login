package com.domain;

public class User {
        private  String userName;
        private  String passWord;



    public String getPassword() {
        return passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.passWord = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + passWord + '\'' +
                '}';
    }
}
