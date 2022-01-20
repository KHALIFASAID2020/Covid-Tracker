package com.covid.tracker.domain.controller;

import com.covid.tracker.CasesOfCovidApiDelegate;
import com.covid.tracker.domain.service.CasesService;
import com.covid.tracker.dto.CountryResponseDto;
import com.covid.tracker.dto.PatientPostDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@Slf4j
public class PatientController implements CasesOfCovidApiDelegate {
    private final CasesService casesService;

    public PatientController(CasesService casesService) {
        this.casesService = casesService;
    }

    @Override
    public ResponseEntity<List<CountryResponseDto>> getCountries() {
        List<CountryResponseDto> countryResponseDtoList = List.of(CountryResponseDto.builder().code("564").build());
        return new ResponseEntity(countryResponseDtoList, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Integer> saveAllCases(List<PatientPostDto> patientPostDto) {
        log.info("Begin save bulk cases of Patient");
        Integer countsave = casesService.save(patientPostDto);
        log.info("End save bulk cases of Patient");
        return new ResponseEntity(countsave, HttpStatus.OK);
    }
}
