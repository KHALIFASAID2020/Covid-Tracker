package com.covid.tracker.domain.service;

import com.covid.tracker.domain.dto.VaccinationDto;
import com.covid.tracker.domain.mapper.VaccinationMapper;
import com.covid.tracker.domain.model.Vaccination;
import com.covid.tracker.domain.repository.VaccinationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class VaccinationService {
    private final VaccinationRepository vaccinationRepository;
    private final VaccinationMapper vaccinationMapper;

    public VaccinationService(VaccinationRepository vaccinationRepository, VaccinationMapper vaccinationMapper) {
        this.vaccinationRepository = vaccinationRepository;
        this.vaccinationMapper = vaccinationMapper;
    }


    public Integer saveAllVaccination(List<VaccinationDto> bulkVaccinationDtos) {
        List<Vaccination> vaccinations = new ArrayList<>();
        for (VaccinationDto vaccinationDto : bulkVaccinationDtos) {
            Vaccination vaccination = vaccinationMapper.toEntity(vaccinationDto);
            vaccinations.add(vaccination);
        }
        return vaccinationRepository.saveAll(vaccinations).size();
    }

    public Integer updateAllVaccination(List<VaccinationDto> bulkVaccinationDtos) {
        List<Vaccination> vaccinations = new ArrayList<>();
        for (VaccinationDto vaccinationDto : bulkVaccinationDtos) {
            Vaccination vaccination = vaccinationRepository.findById(vaccinationDto.getId()).get();
            vaccination = vaccinationMapper.mergeToEntity(vaccination, vaccinationDto);
            vaccinations.add(vaccination);
        }
        return vaccinationRepository.saveAll(vaccinations).size();
    }
}
