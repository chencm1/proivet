package com.jk.service;


import com.jk.model.Ltype;
import com.jk.model.User;

import java.util.List;

public interface UserService {

    List<User> testpro();



    void deleteltem(Integer id);


    User findUserById(Integer id);

    void useradd(User user);

    List<Ltype> ltype();
}
