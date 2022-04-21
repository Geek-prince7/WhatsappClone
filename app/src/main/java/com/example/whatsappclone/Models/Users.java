package com.example.whatsappclone.Models;

public class Users {
    String profilepic,username,mail,pwd,userId,lastmsg;

    public Users(String profilepic, String username, String mail, String pwd, String userId, String lastmsg) {
        this.profilepic = profilepic;
        this.username = username;
        this.mail = mail;
        this.pwd = pwd;
        this.userId = userId;
        this.lastmsg = lastmsg;
    }
    public Users() {}
    //signup constructor haing only 3 param username email and pwd
    public Users(String username, String mail, String pwd) {
        this.username = username;
        this.mail = mail;
        this.pwd = pwd;

    }
    public String getProfilepic() {
        return profilepic;
    }

    public void setProfilepic(String profilepic) {
        this.profilepic = profilepic;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLastmsg() {
        return lastmsg;
    }

    public void setLastmsg(String lastmsg) {
        this.lastmsg = lastmsg;
    }
}
