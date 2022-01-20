package com.covid.tracker.domain.test.repository;

import com.covid.tracker.domain.test.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test,Long> {
}
