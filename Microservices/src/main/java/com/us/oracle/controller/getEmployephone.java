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
<<<<<<< HEAD
        strings.add("666667345");
=======
>>>>>>> 2e8c93478ae9da99c329a3581244f25bf214fe5b
        List<String> strings= new ArrayList<>();
        jjjjjstrings.add("666667345");
        return strings;
    }
}

