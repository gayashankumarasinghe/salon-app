package com.eyepax.hairwork.services;

import com.eyepax.hairwork.model.SalonModel;
import com.eyepax.hairwork.model.StylistModel;

import java.util.List;
import java.util.Optional;

public interface StylistServices {

    List<StylistModel> findAllStylists();

    StylistModel saveStylist(StylistModel stylistData);

    List<StylistModel> saveStylists(List<StylistModel> stylistData);

    Optional <StylistModel> findById(Integer id);

    void delete(StylistModel stylistModel);

    Optional<Iterable<StylistModel>> findAllBySkill(String skill);

    Optional<Iterable<StylistModel>> findAllByRate(String rate);

    Optional<Iterable<StylistModel>> findAllByCity(String city);
    
    Optional<Iterable<StylistModel>> findByCityAndRate(String city, String rate);
    
    Optional<Iterable<StylistModel>> findByCityAndSkills(String city, String skill);
    
    Optional<Iterable<StylistModel>> findBySkillsAndRate(String skill, String rate);
    
    Optional<Iterable<StylistModel>> findBySkillsAndRateAndCity(String skills, String rate, String city);

    Optional<StylistModel> findStylistByEmail(String email);
}
