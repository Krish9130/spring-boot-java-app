package com.levo.dockerexample.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

        @RequestMapping(value = "", method = RequestMethod.GET)
        public String test() {
                return "Hello My name is Krishna & my java application is running: " + new Date();
        }

}
