package com.raymetrics.admin.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

    @RequestMapping(value = "/", method = {RequestMethod.GET})
    public String main(@RequestParam(required = false) String exampleInputEmail){
        return "redirect:/news/list";
    }
}
