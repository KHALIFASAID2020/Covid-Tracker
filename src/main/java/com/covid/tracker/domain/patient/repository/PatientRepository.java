package com.covid.tracker.domain.patient.repository;

import com.covid.tracker.domain.patient.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
}
