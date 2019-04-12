package com.jk.controller;

import com.jk.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@Controller
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    //查
    @RequestMapping("stue")
    public  String stue(){
        return "jues";
    }
    @PostMapping("select")
    @ResponseBody
    public String select(){
        String result = restTemplate.getForObject("http://SPRINGCLOUD-USER-REG/testpro", String.class);
        return result;
    }
    @PostMapping("ltype")
    @ResponseBody
    public String ltype(){
        String result = restTemplate.getForObject("http://SPRINGCLOUD-USER-REG/ltupe", String.class);
        return result;
    }
    //删


    @PostMapping("delete")
    @ResponseBody
    public String delete(Integer id){
        System.out.println("----------------asdas---------------------"+id);
        String result = restTemplate.postForObject("http://SPRINGCLOUD-USER-REG/deleteltem",id, String.class);
        return result;
    }
    //修改新增用户表
    @RequestMapping("saveUser")
    @ResponseBody
    public void saveUser(User user){
        restTemplate.postForObject("http://SPRINGCLOUD-USER-REG/useradd", user, User.class);
    }



    //user回显
    @PostMapping("queryid")
    @ResponseBody
    public User queryid(Integer id){
        User user = restTemplate.postForObject("http://SPRINGCLOUD-USER-REG/queryid",id,User.class);
        return user;
    }














    @GetMapping("selec")
    @ResponseBody
    public String selec(){
        String result = restTemplate.getForObject("http://SPRINGCLOUD-USER-REG/test", String.class);
        return result;
    }

    @GetMapping("sava")
    @ResponseBody
    public User sava(){
        User user=new User();
        user.setName("哈哈");
        User user2 = restTemplate.postForObject("http://SPRINGCLOUD-USER-REG/save", user, User.class);
        return user2;
    }
}
