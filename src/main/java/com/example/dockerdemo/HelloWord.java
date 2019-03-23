package com.example.dockerdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author merz
 * @Description:
 * @date 2019/3/14 15:57
 */
@RestController
public class HelloWord {

    @RequestMapping("/hello")
    public Object hello(String name) {
        return "HELLO WORD!!!" + name;
    }
}
