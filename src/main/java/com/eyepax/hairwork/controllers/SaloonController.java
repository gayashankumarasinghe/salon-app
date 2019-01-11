package com.eyepax.hairwork.controllers;

import com.eyepax.hairwork.model.SaloonModel;
import com.eyepax.hairwork.services.SaloonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //let spring boot to kniw that this is rest api based
@RequestMapping("/saloon") // to add end point
public class SaloonController {

    @Autowired
    private SaloonServices saloonServices;

    @GetMapping("/all") //as It retrieve data from database
    public List<SaloonModel> allSaloons(){
        //return "all users";
        return saloonServices.findAllSaloons();
    }

    @PostMapping
    public String addSaloon(@RequestBody SaloonModel saloondata){
        return saloonServices.saveSaloon(saloondata);
    }

}
