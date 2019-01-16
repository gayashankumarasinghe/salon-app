package com.eyepax.hairwork.services.impl;

import com.eyepax.hairwork.model.SalonModel;
import com.eyepax.hairwork.repository.SalonRepository;
import com.eyepax.hairwork.services.SalonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalonServiceImpl implements SalonServices {

    private SalonRepository salonRepository;

    @Override
    public List<SalonModel> findAllSalons() {
        //logic of search all salons and return
        List<SalonModel> allSalons = salonRepository.findAll();
       // return "Search in db";
        return  allSalons;
    }

    @Override
    public String saveSalon(SalonModel salondata) {
        salonRepository.save(salondata);
        return "data saved";
    }

   @Override
    public String updateSalon(SalonModel updateSalondata) {
            String msg = null;
            if(updateSalondata.getId() != null){
                salonRepository.save(updateSalondata);
                msg = "data is updated";
            }else {
                msg = "Error";
            }
        return msg;
     }

    @Autowired
    public void setSalonRepositary(SalonRepository salonRepositary) {
        this.salonRepository = salonRepositary;
    }
}
