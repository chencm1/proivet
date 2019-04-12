package com.jk.service;


import com.jk.model.Book;
import com.jk.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("springcloud-user-reg")
public interface BookService {

    @GetMapping("querypros")
    List<Book> querypros();


}
