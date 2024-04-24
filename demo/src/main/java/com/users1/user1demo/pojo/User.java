package com.users1.user1demo.pojo;

public class User {
    private String username;
    private String password;
    public String getUsername(){return username;}
    public void setUsername(String username){this.username=username;}
    public String getPassword(String pwd){return password;}
    public void setPassword(String password){this.password=password;}

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
