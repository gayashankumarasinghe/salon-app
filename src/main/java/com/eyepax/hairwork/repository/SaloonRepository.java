package com.eyepax.hairwork.repository;

import com.eyepax.hairwork.model.SaloonModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaloonRepository extends JpaRepository<SaloonModel,Integer> {

    //get all user
    // find by id
    //custom querry
}
