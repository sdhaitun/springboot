package com.example.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

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

    @GetMapping(value="/test")
    public String test() {
//        request.setAttribute("test", "a");
        return "error";
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
