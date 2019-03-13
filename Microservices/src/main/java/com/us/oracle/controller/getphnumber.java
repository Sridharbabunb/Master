package com.us.oracle.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by snb on 3/13/2019.
 */

    @RestController
    public class getphnumber
    {
        @RequestMapping("/getEmployephno")
        public List<String> index() {
            List<String> strings= new ArrayList<>();
            strings.add("9876543212");
            strings.add("9863456789");
            strings.add("98463579091");
            return strings;
        }
    }


