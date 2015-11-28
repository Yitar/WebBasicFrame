package me.yitar.model;

/**
 * Created by Yitar on 2015/11/29.
 */
@Entity
public class User {
    private int id;
    private String username;
    private String password;
    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
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



}