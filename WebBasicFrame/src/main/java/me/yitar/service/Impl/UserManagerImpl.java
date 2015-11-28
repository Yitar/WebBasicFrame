package me.yitar.service.Impl;

/**
 * Created by Yitar on 2015/11/29.
 */
@Component("userManager")
public class UserManagerImpl implements UserManager {

    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }


    @Resource
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    /* (non-Javadoc)
     * @see com.bjsxt.registration.service.impl.UserManager#exists(com.bjsxt.registration.model.User)
     */
    public boolean exists(User u) throws Exception {
        return userDao.checkUserExistsWithName(u.getUsername());

    }

    /* (non-Javadoc)
     * @see com.bjsxt.registration.service.impl.UserManager#add(com.bjsxt.registration.model.User)
     */
    public void add(User u) throws Exception {
        userDao.save(u);
    }

    public List<User> getUsers() {
        // TODO Auto-generated method stub
        return this.userDao.getUsers();
    }

    public User loadById(int id) {
        // TODO Auto-generated method stub
        return this.userDao.loadById(id);
    }
}