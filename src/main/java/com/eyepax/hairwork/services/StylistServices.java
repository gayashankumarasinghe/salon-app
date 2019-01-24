package com.eyepax.hairwork.services;

import com.eyepax.hairwork.model.SalonModel;
import com.eyepax.hairwork.model.StylistModel;

import java.util.List;
import java.util.Optional;

public interface StylistServices {

    List<StylistModel> findAllStylists();

    StylistModel saveStylist(StylistModel stylistData);

    Optional <StylistModel> findById(Integer id);

    void delete(StylistModel stylistModel);

    Optional<Iterable<StylistModel>> findAllBySkill(String skill);

    Optional<Iterable<StylistModel>> findAllByRate(String rate);

    Optional<Iterable<StylistModel>> findAllByCity(String city);
}
