package com.covid.tracker.domain.dto;

import com.covid.tracker.domain.shared.enums.VaccinationType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VaccinationDto extends PatientDto{
    private Long id;
    private LocalDateTime vaccinationDate;
    private LocalDateTime secondVaccinationDate;
    private VaccinationType vaccinationType;
}
