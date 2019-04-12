package com.jk.mapper;

import com.jk.model.Book;
import com.jk.model.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BookMapper {
    @Select("select * from xiao")

    List<Book> querypros();
}
