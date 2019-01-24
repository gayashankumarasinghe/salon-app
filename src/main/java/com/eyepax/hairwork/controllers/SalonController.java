package com.eyepax.hairwork.controllers;

import com.eyepax.hairwork.model.SalonModel;
import com.eyepax.hairwork.services.SalonServices;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public SalonModel addSalon(@RequestBody SalonModel salondata){
        return salonServices.saveSalon(salondata);
    }


    @PutMapping("/{salonId}")
    public SalonModel updateSalon(@PathVariable Integer salonId, @RequestBody SalonModel salonModel) {
        Optional<SalonModel> existingSalonModel = salonServices.findById(salonId);
        if(existingSalonModel.isPresent()) {
            BeanUtils.copyProperties(salonModel, existingSalonModel);
            return salonServices.saveSalon(existingSalonModel.get());
        }
        return null;
    }

    @GetMapping("/find/{id}")
    public SalonModel findSalonById(@PathVariable Integer id){
        Optional<SalonModel> salon = salonServices.findById(id);
        if(salon.isPresent()) {
            return salon.get();
        }
        return null;
    }

@DeleteMapping("/delete/{salonId}")
public void delete(Integer salonId) {
    Optional<SalonModel> existingSalonModel = salonServices.findById(salonId);
    if(existingSalonModel.isPresent()) {
        salonServices.delete(existingSalonModel.get());
    }
}

    @Autowired
    public void setSalonService(SalonServices salonServices) {
        this.salonServices = salonServices;
    }

}
