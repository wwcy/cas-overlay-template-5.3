package org.apereo.cas.custom.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @auth wcy on 2019/11/11.
 */
@RestController
@RequestMapping(value = "/service")
public class ServiceController {

    @RequestMapping(value = "/test")
    public Map<String,String> test(){
        Map<String,String> map = new HashMap<>();
        map.put("msg","ok");
        return map;
    }
}
