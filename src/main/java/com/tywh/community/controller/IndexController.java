package com.tywh.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by zhangyongyi on 2019/9/14.
 */
@Controller
public class IndexController {


    @GetMapping("/")
    public String index(){
        return "index";
    }

}
