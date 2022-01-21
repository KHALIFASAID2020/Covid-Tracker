package com.covid.tracker.domain.repository;

import com.covid.tracker.domain.model.Case;
import com.covid.tracker.domain.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CaseRepository extends JpaRepository<Case,Long> {
}
