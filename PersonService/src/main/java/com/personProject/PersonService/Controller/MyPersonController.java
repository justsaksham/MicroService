package com.personProject.PersonService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Locale;


@RequestMapping("/person")
@RestController
public class MyPersonController {
    @Autowired
    public RestTemplate restTemplate;
    @GetMapping("/name")
    public String getNameOfApplication() {
        System.out.println("call came");
       // int i=0;
//        while(i<5000) {
//            i++;
//           Thread t=new Thread(()-> {
//                String name = restTemplate.getForEntity("http://HOTEL-Service/hotel/name", String.class).getBody().toLowerCase(Locale.ROOT);
//                System.out.println(name);
//            });
//            try {
//                t.start();
//                t.join();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }

       return "Saksham";
    }
}
