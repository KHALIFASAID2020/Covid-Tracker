package com.covid.tracker.domain.dto;

import com.covid.tracker.domain.shared.enums.VaccinationType;
import lombok.*;

import java.time.LocalDateTime;



@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VaccinationDto extends PatientDto{
    private Long id;
    private LocalDateTime vaccinationDate;
    private LocalDateTime secondVaccinationDate;
    private VaccinationType vaccinationType;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
