package com.jk.service;

import com.jk.mapper.UserMapper;
import com.jk.model.Ltype;
import com.jk.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> testpro() {
       List<User> list= userMapper.testpro();
        return list;
    }



    @Override
    public void deleteltem(Integer id) {
        System.out.println("----------------asdas---------------------"+id);

        userMapper.deleteltem(id);
    }

    @Override
    public User findUserById(Integer id) {
        return userMapper.findUserById(id);
    }

    @Override
    public void useradd(User user) {
        Integer id=user.getId();
        if (id!=null){
            userMapper.updateuser(user);//保存用户

        }else {
            userMapper.useradd(user);//保存用户

        }


    }

    @Override
    public List<Ltype> ltype() {
        return userMapper.ltype();
    }


}
