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
    @RequestMapping("/getEmployePhno1")
    public List<String> index() {
        List<String> strings= new ArrayList<>();
        strings.add("8993232234");
        return strings;
    }
}
