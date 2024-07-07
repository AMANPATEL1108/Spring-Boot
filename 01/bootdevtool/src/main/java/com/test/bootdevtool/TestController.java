package com.test.bootdevtool;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        int a=12;
        int b=89;
        int c=10;
        int d=11;
        return  "This is sum="+(a+b+c+d);

    }
}
