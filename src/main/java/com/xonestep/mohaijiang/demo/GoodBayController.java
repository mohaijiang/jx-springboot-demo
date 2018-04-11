package com.xonestep.mohaijiang.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mohaijiang
 * @since 18-4-11
 */
@RestController
@RequestMapping(value = "/goodbay")
public class GoodBayController {

    @GetMapping
    public String goodBay(){

        return "goodbay";
    }
}
