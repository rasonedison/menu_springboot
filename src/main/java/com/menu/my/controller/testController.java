package com.menu.my.controller;


import com.menu.my.po.Banner;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class testController {

    @CrossOrigin
    @GetMapping("/test")
    public Banner test(){

        Banner banner = new Banner();
        banner.setId(100);
        banner.setName("abc");
        banner.setImage("https://img0.baidu.com/it/u=1736659654,3621498367&fm=26&fmt=auto");
        banner.setUrl("https://baidu.com");
        return banner;
    }
}
