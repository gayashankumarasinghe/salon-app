package com.eyepax.hairwork.services;

import com.eyepax.hairwork.model.SalonModel;

import java.util.List;
import java.util.Optional;

public interface SalonServices {

    List<SalonModel> findAllSalons();
    SalonModel  saveSalon(SalonModel salonData);

    void delete(SalonModel salonModel);

    Optional<SalonModel> findById(Integer id);
}
