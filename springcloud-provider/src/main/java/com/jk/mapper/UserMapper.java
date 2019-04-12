package com.jk.mapper;

import com.jk.model.Ltype;
import com.jk.model.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("SELECT u.* , l.name as typel FROM lming u LEFT JOIN ltype l on u.ltype=l.id\n")
    List<User> testpro();



    @Select("delete from lming where id = #{id})")
    void deleteltem(Integer id);



    User findUserById(Integer id);

    void useradd(User user);

    void updateuser(User user);

    @Select("select * from ltype l")

    List<Ltype> ltype();
}
