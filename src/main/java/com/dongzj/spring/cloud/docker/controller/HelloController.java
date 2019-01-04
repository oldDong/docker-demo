package com.dongzj.spring.cloud.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2018/9/3
 * Time: 15:57
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }
}
