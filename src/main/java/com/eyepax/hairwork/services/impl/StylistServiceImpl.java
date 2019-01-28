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
    public Optional<StylistModel> findStylistByEmail(String email) {
        return stylistRepository.findByEmail(email);
    }

    @Override
    public List<StylistModel> saveStylists(List<StylistModel> stylistData) {
        return (List<StylistModel>) stylistRepository.saveAll(stylistData);
    }

    @Override
    public List<StylistModel> findAllStylists() {
        return (List<StylistModel>) stylistRepository.findAll();
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

	@Override
	public Optional<Iterable<StylistModel>> findBySkillsAndRateAndCity(String skill, String rate, String city) {
		return stylistRepository.findBySkillsAndRateAndCity(skill, rate, city);
	}

	@Override
	public Optional<Iterable<StylistModel>> findByCityAndRate(String city, String rate) {
		return stylistRepository.findByCityAndRate(city, rate);
	}

	@Override
	public Optional<Iterable<StylistModel>> findByCityAndSkills(String city, String skill) {
		return stylistRepository.findByCityAndSkills(city, skill);
	}

	@Override
	public Optional<Iterable<StylistModel>> findBySkillsAndRate(String skill, String rate) {
		return stylistRepository.findBySkillsAndRate(skill, rate);
	}
}
