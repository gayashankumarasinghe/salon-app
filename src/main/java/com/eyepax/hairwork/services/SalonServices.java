package com.eyepax.hairwork.services;

import com.eyepax.hairwork.model.SalonModel;

import java.util.List;

public interface SalonServices {

    List<SalonModel> findAllSalons();
    String  saveSalon(SalonModel salondata);

    String updateSalon(SalonModel updateSalondata);
}
