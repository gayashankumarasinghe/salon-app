package com.eyepax.hairwork.controllers;


import com.eyepax.hairwork.model.SalonModel;
import com.eyepax.hairwork.model.SearchToken;
import com.eyepax.hairwork.model.StylistModel;
import com.eyepax.hairwork.services.StylistServices;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("stylist")
public class StylistController {
    private StylistServices stylistServices;

    @GetMapping("/all")
    public List<StylistModel> allStylists(){
        //return "all users";
        return stylistServices.findAllStylists();
    }

    @PutMapping("/update/{stylistId}")
    public StylistModel updateStylist(@PathVariable Integer stylistId, @RequestBody StylistModel stylistModel) {
        Optional<StylistModel> existingStylistModel = stylistServices.findById(stylistId);
        if(existingStylistModel.isPresent()) {
            BeanUtils.copyProperties(stylistModel, existingStylistModel);
            return stylistServices.saveStylist(existingStylistModel.get());
        }
        return null;
    }

//    @PostMapping("/findBySkills/{skill}")
    public Iterable<StylistModel> findStylistBySkill(String skill){
        Optional<Iterable<StylistModel>> stylist = stylistServices.findAllBySkill(skill);
        if(stylist.isPresent()) {
        	System.out.println(stylist.get());
            return stylist.get();
        }

        return null;
    }

//    @GetMapping("/findByRate/{rate}")
    public Iterable<StylistModel> findStylistByRate(String rate){
        Optional<Iterable<StylistModel>> stylist = stylistServices.findAllByRate(rate);
        if(stylist.isPresent()) {
            return stylist.get();
        }

        return null;
    }

//    @GetMapping("/findByCity/{city}")
    public Iterable<StylistModel> findStylistByCityAndRate(String city, String rate){
        Optional<Iterable<StylistModel>> stylist = stylistServices.findByCityAndRate(city, rate);
        if(stylist.isPresent()) {
            return stylist.get();
        }

        return null;
    }
    
    public Iterable<StylistModel> findStylistByCityAndSkills(String city, String skill){
        Optional<Iterable<StylistModel>> stylist = stylistServices.findByCityAndSkills(city, skill);
        if(stylist.isPresent()) {
            return stylist.get();
        }

        return null;
    }
    
    public Iterable<StylistModel> findStylistBySkillsAndRate(String skill, String rate){
        Optional<Iterable<StylistModel>> stylist = stylistServices.findBySkillsAndRate(skill, rate);
        if(stylist.isPresent()) {
            return stylist.get();
        }

        return null;
    }
    
    public Iterable<StylistModel> findStylistByCity(String city){
        Optional<Iterable<StylistModel>> stylist = stylistServices.findAllByCity(city);
        if(stylist.isPresent()) {
            return stylist.get();
        }

        return null;
    }

//    public Iterable<StylistModel> findStylistByBookingDates(String date){
//        Optional<Iterable<StylistModel>> stylist = stylistServices.findAllByCity(city);
//        if(stylist.isPresent()) {
//            return stylist.get();
//        }
//
//        return null;
//    }

    @GetMapping("/find/{id}")
    public StylistModel findStylistById(@PathVariable Integer id){
        Optional<StylistModel> stylist = stylistServices.findById(id);
        if(stylist.isPresent()) {
            return stylist.get();
        }
        return null;
    }

    @PostMapping("/add")
    public List<StylistModel> addStylist(@RequestBody List<StylistModel> stylistdata){
        return stylistServices.saveStylists(stylistdata);
    }
    
    @PostMapping("/search")
    @ResponseBody
    public Iterable<StylistModel> findAllBySkillAndRateAndCity(@RequestBody SearchToken token ) {
    	if(token.skills==null || token.rate==null || token.city==null) {
    		if(token.city==null && token.rate==null) {
    			return this.findStylistBySkill(token.skills);
    		}
    		if(token.city==null && token.skills == null ) {
    			return this.findStylistByRate(token.rate);
    		}
    		if(token.rate==null && token.skills == null ) {
    			return this.findStylistByCity(token.city);
    		}
    		if(token.rate==null) {	
    			return findStylistByCityAndSkills(token.city, token.skills);
        	}
        	if(token.city==null) {	
        		return findStylistBySkillsAndRate(token.skills, token.rate);
        	}
        	if(token.skills==null) {
        		return findStylistByCityAndRate(token.city, token.rate);
    		}
    	}
    	
    	Optional<Iterable<StylistModel>> stylist = stylistServices.findBySkillsAndRateAndCity(token.skills, token.rate, token.city);
    	if(stylist.isPresent()) {
    		System.out.println(stylist.get());
            return stylist.get();
        }

        return null;
    }

    @Autowired
    public void setStylistServices(StylistServices stylistService) {
        this.stylistServices = stylistService;
    }
}
