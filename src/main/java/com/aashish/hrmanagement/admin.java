package com.aashish.hrmanagement;

public class admin {
    private int adminID;
    private String adminname;
    private String email;
    private String password;

    public admin(int adminID, String adminname, String email, String password) {
        this.adminID = adminID;
        this.adminname = adminname;
        this.email = email;
        this.password = password;
    }

    // Getters and setters
    public int getAdminID() {
        return adminID;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

