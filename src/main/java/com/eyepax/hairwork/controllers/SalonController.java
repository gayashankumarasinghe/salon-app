package com.eyepax.hairwork.controllers;

import com.eyepax.hairwork.model.SalonModel;
import com.eyepax.hairwork.services.SalonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //let spring boot to know that this is rest api based
@RequestMapping("/salon") // to add end point
public class SalonController {

    private SalonServices salonServices;

    @GetMapping("/all") //as It retrieve data from database
    public List<SalonModel> allSalons(){
        //return "all users";
        return salonServices.findAllSalons();
    }

    @PostMapping("/add")
    public String addSalon(@RequestBody SalonModel salondata){
        return salonServices.saveSalon(salondata);
    }


    @PutMapping("/update")
    public String updateSalon(@RequestBody SalonModel updateSalondata){
        return  salonServices.updateSalon(updateSalondata);
    }

    @Autowired
    public void setSalonService(SalonServices salonServices) {
        this.salonServices = salonServices;
    }

}
