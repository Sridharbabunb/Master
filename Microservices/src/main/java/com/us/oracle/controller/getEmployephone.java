package com.us.oracle.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by snb on 3/13/2019.
 */

@RestController
public class getEmployephone
{
    @RequestMapping("/getEmployePhno")
    public List<String> index() {
        strings.add("666667345");
        return strings;
    }
}

