package com.covid.tracker.domain.service;

import com.covid.tracker.domain.dto.CaseDto;
import com.covid.tracker.domain.mapper.CaseMapper;
import com.covid.tracker.domain.model.Case;
import com.covid.tracker.domain.repository.CaseRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class CasesService {
 private final CaseMapper caseMapper;
    private final CaseRepository caseRepository;

    public CasesService(CaseMapper caseMapper, CaseRepository caseRepository) {
        this.caseMapper = caseMapper;
        this.caseRepository = caseRepository;
    }


    public Integer saveAllCases(List<CaseDto> bulkCaseDtos) {
        List<Case> cases = new ArrayList<>();
        for (CaseDto caseDto : bulkCaseDtos) {
            Case caseCovid = caseMapper.toEntity(caseDto);
            cases.add(caseCovid);
        }
        return caseRepository.saveAll(cases).size();
    }

    public Integer updateAllCases(List<CaseDto> bulkCaseDtos) {
        List<Case> cases = new ArrayList<>();
        for (CaseDto caseDto : bulkCaseDtos) {
            Case caseCovid = caseRepository.findById(caseDto.getId()).get();
            caseCovid = caseMapper.mergeToEntity(caseCovid, caseDto);
            cases.add(caseCovid);
        }
        return caseRepository.saveAll(cases).size();
    }
}
