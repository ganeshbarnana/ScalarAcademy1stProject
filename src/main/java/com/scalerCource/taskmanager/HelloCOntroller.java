package com.scalerCource.taskmanager;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCOntroller {
    @GetMapping("/hello")
    String hello()
    {
        return "hello";
    }

}
