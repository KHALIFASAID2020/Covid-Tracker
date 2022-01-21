package com.covid.tracker.domain.dto;

import com.covid.tracker.domain.shared.enums.Country;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class ReportCountryCases {
    private Country country;
    private Integer caseOfDay;
    private Integer caseOfMonth;
    private Integer caseOfYear;
}
