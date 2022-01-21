package com.covid.tracker.domain.repository;

import com.covid.tracker.domain.model.CaseCovid;
import com.covid.tracker.domain.model.Patient;
import com.covid.tracker.domain.shared.enums.Country;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CaseRepository extends JpaRepository<CaseCovid,Long> {

/*    @Query(value = "SELECT casecovid " +
            "FROM " +
            "    CaseCovid casecovid " +
            "WHERE casecovid.country = :country " +
            "AND (casecovid.createdAt)" +
            "   "
    )*/
  //  Page<CaseCovid> findAll(@Param("day") Integer day, @Param("month") Integer month, @Param("year") Integer year, @Param("country") Country country, Pageable paging);
}
