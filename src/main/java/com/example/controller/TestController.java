package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by root on 2017/7/27.
 */
@Controller
public class TestController {

    @RequestMapping(value="/{id}")
    @ResponseBody
    public String view(@PathVariable("id") Long id) {
        System.out.println(id);
        return "welcome" + id;
    }

    @RequestMapping("/tes")
    public String tes() {
        return "error2";
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/in")
    public String index2() {
        return "index";
    }
}
