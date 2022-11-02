package testfilter.mytest.testfilter.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class getAdminController {
    @GetMapping("/admin")
    public void getUser(){
        System.out.println("Im admin");
    }
}
