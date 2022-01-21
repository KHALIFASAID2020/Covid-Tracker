package com.covid.tracker.domain.dto;

import com.covid.tracker.domain.shared.enums.ResultTest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CaseDto extends PatientDto{
    private Long id;
    private LocalDateTime testDate;
    private ResultTest resultTest;
    protected LocalDateTime createdAt;
    protected LocalDateTime updatedAt;
}
