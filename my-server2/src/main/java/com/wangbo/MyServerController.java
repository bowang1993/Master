package com.wangbo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/web", method = RequestMethod.GET)
public class MyServerController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/getPort")
    public String service1() {
        return "Hello service1, Current server prot is " + this.port;
    }
}
