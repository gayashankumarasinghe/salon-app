package com.eyepax.hairwork.controllers;

import com.eyepax.hairwork.services.SaloonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //let spring boot to kniw that this is rest api based
@RequestMapping("/saloon") // to add end point
public class SaloonController {

    @Autowired
    private SaloonServices saloonServices;

    @GetMapping("/all") //as I retreve data from database
    public String allSaloons(){
        //return "all users";
        return saloonServices.findAllSaloons();
    }
}
