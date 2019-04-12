package com.jk.controller;

import com.jk.model.Book;
import com.jk.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class BookController {

    @Resource
    private BookService bookService;

    @RequestMapping("stue")
    public  String stue(){
        return "jues";
    }
    @GetMapping("querypros")
    public List<Book> querypros(){
        return bookService.querypros();
    }












}
