package com.eyepax.hairwork.repository;

import com.eyepax.hairwork.model.SalonModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalonRepository extends JpaRepository<SalonModel,Integer> {

    //get all user
    // find by id
    //custom querry
}
