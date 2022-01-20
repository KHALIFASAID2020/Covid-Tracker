package com.covid.tracker.domain.controller;

import com.covid.tracker.CasesOfCovidApi;
import com.covid.tracker.CasesOfCovidApiDelegate;
import com.covid.tracker.dto.CountryResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@Slf4j
public class PatientController implements CasesOfCovidApiDelegate {
    @Override
    public ResponseEntity<List<CountryResponseDto>> getCountries() {
        List<CountryResponseDto> countryResponseDtoList = List.of(CountryResponseDto.builder().code("564").build());
        return new ResponseEntity(countryResponseDtoList, HttpStatus.OK);
    }
}
