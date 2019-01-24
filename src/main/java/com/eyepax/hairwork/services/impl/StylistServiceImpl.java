package com.eyepax.hairwork.services.impl;

import com.eyepax.hairwork.model.SalonModel;
import com.eyepax.hairwork.model.StylistModel;
import com.eyepax.hairwork.repository.StylistRepository;
import com.eyepax.hairwork.services.StylistServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class StylistServiceImpl implements StylistServices {
    private StylistRepository stylistRepository;

    @Override
    public List<StylistModel> findAllStylists() {
        return stylistRepository.findAll();
    }

    @Override
    public StylistModel saveStylist(StylistModel stylistData) {
        return stylistRepository.save(stylistData);
    }

    @Override
    public Optional<StylistModel> findById(Integer id) {
        return stylistRepository.findById(id);
    }

    @Override
    public void delete(StylistModel stylistModel) {
        stylistRepository.delete(stylistModel);
    }

    @Autowired
    public void setStylistRepositary(StylistRepository stylistRepository) {
        this.stylistRepository = stylistRepository;
    }

    @Override
    public Optional<Iterable<StylistModel>> findAllBySkill(String skill) {
        return stylistRepository.findBySkills(skill);

    }

    @Override
    public Optional<Iterable<StylistModel>> findAllByRate(String rate) {
        return stylistRepository.findByRate(rate);
    }

    @Override
    public Optional<Iterable<StylistModel>> findAllByCity(String city) {
        return stylistRepository.findByCity(city);
    }
}
