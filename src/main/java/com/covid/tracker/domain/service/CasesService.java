package com.covid.tracker.domain.service;

import com.covid.tracker.domain.dto.PatientMapper;
import com.covid.tracker.domain.model.Patient;
import com.covid.tracker.domain.repository.PatientRepository;
import com.covid.tracker.dto.PatientPostDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class CasesService {
    private final PatientMapper patientMapper;
    private final PatientRepository patientRepository;
    public CasesService(PatientMapper patientMapper, PatientRepository patientRepository) {
        this.patientMapper = patientMapper;
        this.patientRepository = patientRepository;
    }

    public Integer save (List<PatientPostDto> bulkPatientPostDtoList){
        List <Patient> patients = new ArrayList<>();
        for (PatientPostDto patientPostDto : bulkPatientPostDtoList) {
            Patient patient = patientMapper.toEntity(patientPostDto);
            patients.add(patient);
        }
        return patientRepository.saveAll(patients).size();
    }
}
