package com.aastu.service;

import com.aastu.model.Users;
import java.util.List;

/**
 * Created by Fraol on 8/17/2017.
 */
public interface UserService {

    public List<Users> getAllUsers();
    public Users findUserByUsername(String username);
//    public void editUser();
    public void delete(Integer id);
    public void saveUser(Users user);
}
