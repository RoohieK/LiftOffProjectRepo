package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    //@GetMapping
    @RequestMapping(value="")
    @ResponseBody
    public String index(){
        return "Hello, World!";
    }
    @RequestMapping(value="goodbye")
    @ResponseBody
    public String goodbye(){
        return  "GoodBye";
    }
}
