package com.covid.tracker.domain.dto;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PatientMapper {
/*
    public Patient toEntity(PatientPostDto patientPostDto) {
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

    public Patient mergeToEntity(Patient patient, PatientPostDto patientPostDto) {
        if (patientPostDto == null) {
            return null;
        }

        patient.setLastName(patientPostDto.getLastName());
        patient.setFirstName(patientPostDto.getFirstName());
        patient.setCellPhone(patientPostDto.getCellPhone());
        patient.setBirthDate(patientPostDto.getBirthDate());
        patient.setAddress(patientPostDto.getAddress());
        patient.setCountry(patientPostDto.getCountry());
        patient.setResultTest(patientPostDto.getResultTest());
        patient.setTestDate(patientPostDto.getTestDate().toLocalDateTime());
        return patient;
    }*/

}
