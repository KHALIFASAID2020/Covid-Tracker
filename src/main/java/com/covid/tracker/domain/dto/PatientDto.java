package com.covid.tracker.domain.dto;

import com.covid.tracker.domain.shared.enums.Country;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatientDto {

    private String lastName;
    private String firstName;
    private LocalDate birthDate;
    private String address;
    private String cellPhone;
    private Country country;



}
