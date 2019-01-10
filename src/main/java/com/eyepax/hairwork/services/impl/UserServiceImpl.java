package com.eyepax.hairwork.services.impl;

import com.eyepax.hairwork.services.SaloonServices;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements SaloonServices {
    @Override
    public String findAllSaloons() {
        //logic of search all saloons and return
        return "Search in db";
    }
}
