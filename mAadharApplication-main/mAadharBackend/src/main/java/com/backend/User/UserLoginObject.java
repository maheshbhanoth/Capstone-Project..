package com.backend.User;

/**
 * Created by IntelliJ IDEA
 * User: Mahesh
 * Date: 03/08/2023
 * Time: 16:42
 */


public class UserLoginObject {
    private String citizenId;
    private String password;

    public String getCitizenId() {
        return citizenId;
    }

    public void setCitizenId(String citizenId) {
        this.citizenId = citizenId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
