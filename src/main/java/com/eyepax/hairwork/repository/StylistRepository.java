package com.eyepax.hairwork.repository;

import com.eyepax.hairwork.model.SalonModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StylistRepository extends JpaRepository<SalonModel,Integer> {
}
