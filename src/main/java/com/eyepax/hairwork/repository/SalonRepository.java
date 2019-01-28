package com.eyepax.hairwork.repository;

import com.eyepax.hairwork.model.SalonModel;
import com.eyepax.hairwork.model.StylistModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SalonRepository extends JpaRepository<SalonModel,Integer> {

    Optional<SalonModel> findByEmail(String email);
    //get all user
    // find by id
    //custom querry
}
