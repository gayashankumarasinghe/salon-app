package com.eyepax.hairwork.services;

import com.eyepax.hairwork.model.SaloonModel;

import java.util.List;

public interface SaloonServices {

    List<SaloonModel> findAllSaloons();
    String  saveSaloon(SaloonModel saloondata);
}
