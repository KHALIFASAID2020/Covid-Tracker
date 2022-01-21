package com.covid.tracker.domain.controller;

import com.covid.tracker.domain.dto.CaseDto;
import com.covid.tracker.domain.dto.VaccinationDto;
import com.covid.tracker.domain.service.CasesService;
import com.covid.tracker.domain.service.VaccinationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@Slf4j
@RequestMapping(value = VaccinationController.ROOT_RESOURCE, produces = MediaType.APPLICATION_JSON_VALUE)
public class VaccinationController {
    public static final String ROOT_RESOURCE = "/api/vaccination";

    private final VaccinationService vaccinationService;

    public VaccinationController(VaccinationService vaccinationService) {
        this.vaccinationService = vaccinationService;
    }

    @PostMapping
    public ResponseEntity<Integer> saveAllVaccination(@RequestBody List<VaccinationDto> vaccinationDtos) {
        log.info("Begin save All vaccination");
        Integer countSaveVaccination = vaccinationService.saveAllVaccination(vaccinationDtos);
        log.info("End save All vaccination");
        return ResponseEntity.ok(countSaveVaccination);

    }

    @PutMapping
    public ResponseEntity<Integer> updateAllCVaccination(@RequestBody List<VaccinationDto> vaccinationDtos) {
        log.info("Begin update All vaccination");
        Integer countUpdateCases = vaccinationService.updateAllVaccination(vaccinationDtos);
        log.info("End update All vaccination");
        return ResponseEntity.ok(countUpdateCases);
    }




}
