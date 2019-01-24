package com.eyepax.hairwork.repository;

import com.eyepax.hairwork.model.StylistModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StylistRepository extends JpaRepository<StylistModel,Integer> {
    Optional<Iterable<StylistModel>> findBySkills(String skill);

    Optional<Iterable<StylistModel>> findByRate(String rate);

    Optional<Iterable<StylistModel>> findByCity(String city);
}
