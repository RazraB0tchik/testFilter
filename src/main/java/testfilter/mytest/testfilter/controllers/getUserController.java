package testfilter.mytest.testfilter.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/auth")
public class getUserController {

    @GetMapping("/getAllUser")
    public void getUser(){
        System.out.println("Im user");
    }

}
