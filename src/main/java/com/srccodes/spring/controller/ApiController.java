package com.srccodes.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hedi on 12/11/15.
 */
@RestController(value = "/api")
public class ApiController {

    /**
     * parameter to send with the header: Basic dGVzdDp0ZXN0
     *
     */

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody String helloWorldGet() {
        return "Hello World !!";
    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody String helloWorldPost() {
        return "Hello World !!";
    }
}
