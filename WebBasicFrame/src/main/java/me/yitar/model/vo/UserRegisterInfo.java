package me.yitar.model.vo;

/**
 * Created by Yitar on 2015/11/29.
 */
public class UserRegisterInfo {
    private int id;
    private String username;
    private String password;
    private String password2;
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword2() {
        return password2;
    }
    public void setPassword2(String password2) {
        this.password2 = password2;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
