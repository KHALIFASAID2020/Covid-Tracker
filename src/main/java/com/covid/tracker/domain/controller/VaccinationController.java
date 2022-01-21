package com.covid.tracker.domain.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@Slf4j
@RequestMapping("/api/vaccination")
public class VaccinationController {

/*    private final CasesService casesService;

    public PatientController(CasesService casesService) {
        this.casesService = casesService;
    }


    @Override
    public ResponseEntity<Integer> saveAllCases(List<PatientPostDto> patientPostDto) {
        log.info("Begin save bulk cases of Patient");
        Integer countsave = casesService.save(patientPostDto);
        log.info("End save bulk cases of Patient");
        return new ResponseEntity(countsave, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Integer> updateAllCases(List<PatientPostDto> patientPostDto) {
        log.info("Begin save bulk cases of Patient");
        Integer countsave = casesService.update(patientPostDto);
        log.info("End save bulk cases of Patient");
        return new ResponseEntity(countsave, HttpStatus.OK);
    }*/
}
