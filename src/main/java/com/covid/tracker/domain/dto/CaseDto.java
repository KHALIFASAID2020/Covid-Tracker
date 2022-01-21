package com.covid.tracker.domain.dto;

import com.covid.tracker.domain.shared.enums.ResultTest;
import lombok.*;

import java.time.LocalDateTime;


@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CaseDto extends PatientDto{
    private Long id;
    private LocalDateTime testDate;
    private ResultTest resultTest;
    protected LocalDateTime createdAt;
    protected LocalDateTime updatedAt;
}
