package com.personProject.HotelService.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotel")
public class MyHotelController {

    @GetMapping("/name")
    public String getNameOfApplication(){
        System.out.println("call came");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return "HotelService";
    }
}
