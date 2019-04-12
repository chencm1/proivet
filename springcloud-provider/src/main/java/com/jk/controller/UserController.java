package com.jk.controller;

import com.jk.model.Ltype;
import com.jk.model.User;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RedisTemplate redisTemplate;
//查
    @GetMapping("testpro")
    @ResponseBody
    public List<User> testpro(){
        List<Object> ming = redisTemplate.opsForList().range("ming", 0, -1);
        if (ming!=null && ming.size()>0)
        {
            List<User> xiao = (List<User>) ming.get(0);
            return xiao;
        }
        List<User> list=userService.testpro();
      if (list==null){
          redisTemplate.opsForList().leftPush("ming",list);
      }else{
          redisTemplate.opsForList().leftPush("ming",list);

       }
        return list;
    }
    //type
    @RequestMapping("ltupe")
    @ResponseBody
    public List<Ltype> ltype(){
        List<Ltype> list=userService.ltype();
        return list;
    }
    //删
   @RequestMapping("deleteltem")
   @ResponseBody
   public  void  deleteltem(@RequestBody Integer id){
       userService. deleteltem(id);

   }

    //修改新增用户表
    @RequestMapping("useradd")
    @ResponseBody
    public void useradd(@RequestBody User user){
        userService.useradd(user);
    }

    //user回显
    @RequestMapping("queryid")
    @ResponseBody
    public User findUserById(@RequestBody Integer id){
        return userService.findUserById(id);
    }



    @GetMapping("test")
    @ResponseBody
    public String test(){
        System.out.println("-------------1---------------");
        return "success---";
    }

    @GetMapping("save")
    @ResponseBody
    public User save(@RequestBody User user){
    user.setId(1);
        return user;
    }

}
