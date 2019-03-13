package com.us.oracle.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by snb on 3/13/2019.
 */

@RestController
public class webController {

    @RequestMapping("/web")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}


