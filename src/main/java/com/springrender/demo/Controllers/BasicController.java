package com.springrender.demo.Controllers;

import com.springrender.demo.Models.BasicRecord;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basic")
public class BasicController {


    @GetMapping
    public BasicRecord basic() {
        return new BasicRecord(1,"Un mensaje" , "de mangano");
    }
}
