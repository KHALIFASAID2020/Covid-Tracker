package com.covid.tracker.domain.mapper;

import com.covid.tracker.domain.dto.CaseDto;
import com.covid.tracker.domain.model.Case;
import com.covid.tracker.domain.model.Patient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CaseMapper {

    public Case toEntity(CaseDto caseDto){
        if(caseDto == null){
            return null;
        }
      Case caseCovid = new Case();
        return caseCovid;
    }
}
