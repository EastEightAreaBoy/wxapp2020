package com.wangzj.wxapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wzj
 * 2020-03-03
 **/
@Controller
public class IndexController {

    @ResponseBody
    @RequestMapping("hello")
    public String validate() {
        return "ok";
    }

}
