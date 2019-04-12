package com.jk.service;

import com.jk.mapper.BookMapper;
import com.jk.model.Book;
import com.jk.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BookServiceImpl {


    @Autowired
    private BookMapper bookMapper;

    @GetMapping("querypros")
    @ResponseBody
    public List<Book> querypros(){
       return bookMapper.querypros();
    }



}
