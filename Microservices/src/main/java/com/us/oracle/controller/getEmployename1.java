package com.us.oracle.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by snb on 3/13/2019.
 */

@RestController
public class getEmployename
{
    @RequestMapping("/getEmployename")
    public List<String> index() {
        List<String> strings= new ArrayList<>();
        strings.add("Sridhar");
        strings.add("Babu");
        strings.add("Raghu");
        return strings;
    }
}

