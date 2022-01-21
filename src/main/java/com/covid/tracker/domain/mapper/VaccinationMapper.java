package com.covid.tracker.domain.mapper;

import com.covid.tracker.domain.dto.VaccinationDto;
import com.covid.tracker.domain.model.Vaccination;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class VaccinationMapper {
    public Vaccination toEntity(VaccinationDto vaccinationDto) {
        if (vaccinationDto == null) {
            return null;
        }
        Vaccination vaccination = new Vaccination();
        vaccination.setVaccinationType(vaccinationDto.getVaccinationType());
        vaccination.setSecondVaccinationDate(vaccinationDto.getSecondVaccinationDate());
        vaccination.setVaccinationDate(vaccinationDto.getVaccinationDate());
        vaccination.setAddress(vaccinationDto.getAddress());
        vaccination.setBirthDate(vaccinationDto.getBirthDate());
        vaccination.setCellPhone(vaccinationDto.getCellPhone());
        vaccination.setCountry(vaccinationDto.getCountry());
        vaccination.setFirstName(vaccinationDto.getFirstName());
        vaccination.setLastName(vaccinationDto.getFirstName());

        return vaccination;
    }


    public VaccinationDto toDto(Vaccination vaccination) {
        if (vaccination == null) {
            return null;
        }
        VaccinationDto vaccinationDto = new VaccinationDto();
        vaccinationDto.setId(vaccination.getId());
        vaccinationDto.setAddress(vaccination.getAddress());
        vaccinationDto.setBirthDate(vaccination.getBirthDate());
        vaccinationDto.setCellPhone(vaccination.getCellPhone());
        vaccinationDto.setCountry(vaccination.getCountry());
        vaccinationDto.setFirstName(vaccination.getFirstName());
        vaccinationDto.setLastName(vaccination.getFirstName());
        vaccinationDto.setCreatedAt(vaccination.getCreatedAt());
        vaccinationDto.setUpdatedAt(vaccination.getUpdatedAt());
        vaccinationDto.setVaccinationType(vaccination.getVaccinationType());
        vaccinationDto.setSecondVaccinationDate(vaccination.getSecondVaccinationDate());
        vaccinationDto.setVaccinationDate(vaccination.getVaccinationDate());
        return vaccinationDto;
    }

    public Vaccination mergeToEntity(Vaccination vaccination, VaccinationDto vaccinationDto) {

        if (vaccinationDto == null) {
            return null;
        }

        vaccination.setLastName(vaccinationDto.getLastName());
        vaccination.setFirstName(vaccinationDto.getFirstName());
        vaccination.setCellPhone(vaccinationDto.getCellPhone());
        vaccination.setBirthDate(vaccinationDto.getBirthDate());
        vaccination.setAddress(vaccinationDto.getAddress());
        vaccination.setCountry(vaccinationDto.getCountry());
        vaccination.setVaccinationDate(vaccinationDto.getVaccinationDate());
        vaccination.setSecondVaccinationDate(vaccinationDto.getSecondVaccinationDate());
        vaccination.setVaccinationType(vaccinationDto.getVaccinationType());

        return vaccination;
    }
}
