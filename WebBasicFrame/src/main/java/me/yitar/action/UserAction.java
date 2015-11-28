package me.yitar.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import me.yitar.model.User;
import me.yitar.model.vo.UserRegisterInfo;
import me.yitar.service.UserManager;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Yitar on 2015/11/29.
 */
@Component("u")
@Scope("prototype")
public class UserAction extends ActionSupport implements ModelDriven {


    private UserRegisterInfo info = new UserRegisterInfo();

    private UserManager userManager;

    private List<User> users;

    private User user;

    public UserAction(){
        System.out.println("useraction created!");
    }

    @Override
    public String execute() throws Exception {
        System.out.println(info.getUsername());
        User u = new User();
        u.setUsername(info.getUsername());
        u.setPassword(info.getPassword());
        if(userManager.exists(u)) {
            return "fail";
        }
        userManager.add(u);
        return "success";
    }

    public UserRegisterInfo getInfo() {
        return info;
    }

    public void setInfo(UserRegisterInfo info) {
        this.info = info;
    }

    //@Override
    public Object getModel() {
        return info;
    }

    public String list() {
        this.users = this.userManager.getUsers();
        return "list";
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public String load() {
        this.user = this.userManager.loadById(info.getId());
        return "load";
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserManager getUserManager() {
        return userManager;
    }

    @Resource
    public void setUserManager() {
        setUserManager();
    }

    @Resource
    public void setUserManager(UserManager userManager) {
        this.userManager = userManager;
    }

}