package com.covid.tracker.domain.repository;

import com.covid.tracker.domain.model.Vaccination;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaccinationRepository extends JpaRepository<Vaccination,Long> {
}
