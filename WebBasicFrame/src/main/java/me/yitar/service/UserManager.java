package me.yitar.service;

import me.yitar.model.User;

import java.util.List;

/**
 * Created by Yitar on 2015/11/29.
 */
public interface UserManager {

    public abstract boolean exists(User u) throws Exception;

    public abstract void add(User u) throws Exception;

    public List<User> getUsers();

    public User loadById(int id);

}