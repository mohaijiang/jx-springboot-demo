package com.xonestep.mohaijiang.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * say hello to everyone
 * @author mohaijiang
 * @since 18-4-11
 */
@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping
    public String sayHello(){

        return "hello 2";
    }
}
