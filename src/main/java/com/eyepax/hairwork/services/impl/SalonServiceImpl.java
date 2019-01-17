package com.eyepax.hairwork.services.impl;

import com.eyepax.hairwork.model.SalonModel;
import com.eyepax.hairwork.repository.SalonRepository;
import com.eyepax.hairwork.services.SalonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalonServiceImpl implements SalonServices {

    private SalonRepository salonRepository;

    @Override
    public List<SalonModel> findAllSalons() {
        return salonRepository.findAll();
    }

    @Override
    public SalonModel saveSalon(SalonModel salonData) {
        return salonRepository.save(salonData);
    }

    @Override
    public Optional<SalonModel> findById(Integer id) {
        return salonRepository.findById(id);
    }

    @Override
    public void delete(SalonModel salonModel) {
        salonRepository.delete(salonModel);
    }

    @Autowired
    public void setSalonRepositary(SalonRepository salonRepositary) {
        this.salonRepository = salonRepositary;
    }
}
