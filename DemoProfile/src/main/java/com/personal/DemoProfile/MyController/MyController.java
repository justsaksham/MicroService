package com.personal.DemoProfile.MyController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Profile")
@Profile("dev")
public class MyController {
    @Value("${MyDataAgain}")
    public String myData;

    @GetMapping
    public String getProfile(){
        return myData;
    }

}
