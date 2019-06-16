package com.github.tkmtmkt.study;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HelloGradleController {

    @GetMapping
    public String helloGradleGet() {
        return "[GET] Hello Gradle!";
    }

    @PostMapping
    public String helloGradlePost() {
        return "[POST] Hello Gradle!";
    }
}
