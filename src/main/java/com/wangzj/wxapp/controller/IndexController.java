package com.wangzj.wxapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author wzj
 * 2020-03-03
 **/
@Controller
public class IndexController {

    @GetMapping("hello")
    public String validate() {
        return "ok";
    }

}
