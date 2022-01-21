package com.covid.tracker.domain.mapper;

import com.covid.tracker.domain.dto.CaseDto;
import com.covid.tracker.domain.model.CaseCovid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CaseMapper {

    public CaseCovid toEntity(CaseDto caseDto) {
        if (caseDto == null) {
            return null;
        }
        CaseCovid caseCovid = new CaseCovid();
        caseCovid.setResultTest(caseDto.getResultTest());
        caseCovid.setTestDate(caseDto.getTestDate());
        caseCovid.setAddress(caseDto.getAddress());
        caseCovid.setBirthDate(caseDto.getBirthDate());
        caseCovid.setCellPhone(caseDto.getCellPhone());
        caseCovid.setCountry(caseDto.getCountry());
        caseCovid.setFirstName(caseDto.getFirstName());
        caseCovid.setLastName(caseDto.getFirstName());

        return caseCovid;
    }


    public CaseDto toDto(CaseCovid caseCovid) {
        if (caseCovid == null) {
            return null;
        }
        CaseDto caseDto = new CaseDto();
        caseDto.setId(caseCovid.getId());
        caseDto.setResultTest(caseCovid.getResultTest());
        caseDto.setTestDate(caseCovid.getTestDate());
        caseDto.setAddress(caseCovid.getAddress());
        caseDto.setBirthDate(caseCovid.getBirthDate());
        caseDto.setCellPhone(caseCovid.getCellPhone());
        caseDto.setCountry(caseCovid.getCountry());
        caseDto.setFirstName(caseCovid.getFirstName());
        caseDto.setLastName(caseCovid.getFirstName());
        caseDto.setCreatedAt(caseCovid.getCreatedAt());
        caseDto.setUpdatedAt(caseCovid.getUpdatedAt());
        return caseDto;
    }

    public CaseCovid mergeToEntity(CaseCovid caseCovid, CaseDto caseDto) {

        if (caseDto == null) {
            return null;
        }

        caseCovid.setLastName(caseDto.getLastName());
        caseCovid.setFirstName(caseDto.getFirstName());
        caseCovid.setCellPhone(caseDto.getCellPhone());
        caseCovid.setBirthDate(caseDto.getBirthDate());
        caseCovid.setAddress(caseDto.getAddress());
        caseCovid.setCountry(caseDto.getCountry());
        caseCovid.setResultTest(caseDto.getResultTest());
        caseCovid.setTestDate(caseDto.getTestDate());
        return caseCovid;
    }
}
