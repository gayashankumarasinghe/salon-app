package com.eyepax.hairwork.controllers;


import com.eyepax.hairwork.model.SalonModel;
import com.eyepax.hairwork.model.StylistModel;
import com.eyepax.hairwork.services.StylistServices;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/stylist")
public class StylistController {
    private StylistServices stylistServices;

    @GetMapping("/all")
    public List<StylistModel> allStylists(){
        //return "all users";
        return stylistServices.findAllStylists();
    }

    @PutMapping("/update/{stylistId}")
    public StylistModel updateStylist(@PathVariable Integer stylistId, @RequestBody StylistModel stylistModel) {
        Optional<StylistModel> existingStylistModel = stylistServices.findById(stylistId);
        if(existingStylistModel.isPresent()) {
            BeanUtils.copyProperties(stylistModel, existingStylistModel);
            return stylistServices.saveStylist(existingStylistModel.get());
        }
        return null;
    }
}
