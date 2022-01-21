package com.covid.tracker.domain.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class CasesService {
  /*  private final PatientMapper patientMapper;
    private final PatientRepository patientRepository;

    public CasesService(PatientMapper patientMapper, PatientRepository patientRepository) {
        this.patientMapper = patientMapper;
        this.patientRepository = patientRepository;
    }

    public Integer save(List<PatientPostDto> bulkPatientPostDtoList) {
        List<Patient> patients = new ArrayList<>();
        for (PatientPostDto patientPostDto : bulkPatientPostDtoList) {
            Patient patient = patientMapper.toEntity(patientPostDto);
            patients.add(patient);
        }
        return patientRepository.saveAll(patients).size();
    }

    public Integer update(List<PatientPostDto> bulkPatientPostDtoList) {
        List<Patient> patients = new ArrayList<>();
        for (PatientPostDto patientPostDto : bulkPatientPostDtoList) {
            Patient patient = patientRepository.findById(patientPostDto.getId()).get();
            patient = patientMapper.mergeToEntity(patient, patientPostDto);
            patients.add(patient);
        }
        return patientRepository.saveAll(patients).size();
    }*/
}
