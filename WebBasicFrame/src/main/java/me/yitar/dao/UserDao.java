package me.yitar.dao;

/**
 * Created by Yitar on 2015/11/29.
 */
public interface UserDao {
    public void save(User u);
    public boolean checkUserExistsWithName(String username);
    public List<User> getUsers();
    public User loadById(int id);
}
