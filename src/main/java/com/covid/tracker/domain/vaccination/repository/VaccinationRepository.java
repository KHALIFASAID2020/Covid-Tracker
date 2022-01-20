package com.covid.tracker.domain.vaccination.repository;

import com.covid.tracker.domain.vaccination.model.Vaccination;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaccinationRepository extends JpaRepository<Vaccination,Long> {
}
