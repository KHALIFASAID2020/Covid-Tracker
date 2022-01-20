package com.covid.tracker.domain.dto;

import com.covid.tracker.domain.model.Patient;
import com.covid.tracker.dto.PatientPostDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PatientMapper {

    public Patient toEntity(PatientPostDto patientPostDto){
        if (patientPostDto == null) {
            return null;
        }
        return Patient.builder()
                .lastName(patientPostDto.getLastName())
                .firstName(patientPostDto.getFirstName())
                .cellPhone(patientPostDto.getCellPhone())
                .birthDate(patientPostDto.getBirthDate())
                .address(patientPostDto.getAddress())
                .country(patientPostDto.getCountry())
                .resultTest(patientPostDto.getResultTest())
                .testDate(patientPostDto.getTestDate().toLocalDateTime())
                .build();
    }

}
