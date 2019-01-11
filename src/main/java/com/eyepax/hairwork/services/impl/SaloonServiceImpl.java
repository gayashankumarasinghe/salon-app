package com.eyepax.hairwork.services.impl;

import com.eyepax.hairwork.model.SaloonModel;
import com.eyepax.hairwork.repository.SaloonRepository;
import com.eyepax.hairwork.services.SaloonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaloonServiceImpl implements SaloonServices {

    @Autowired
    private SaloonRepository saloonRepository;

    @Override
    public List<SaloonModel> findAllSaloons() {
        //logic of search all saloons and return
        List<SaloonModel> allSaloons = saloonRepository.findAll();
       // return "Search in db";
        return  allSaloons;
    }

    @Override
    public String saveSaloon(SaloonModel saloondata) {
        saloonRepository.save(saloondata);
        return "data saved";
    }
}
