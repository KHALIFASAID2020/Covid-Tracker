package com.covid.tracker.domain.repository;

import com.covid.tracker.domain.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test,Long> {
}