package com.covid.tracker.domain.controller;

import com.covid.tracker.domain.dto.CaseDto;
import com.covid.tracker.domain.dto.PaginationDto;
import com.covid.tracker.domain.service.CasesService;
import com.covid.tracker.domain.shared.enums.Country;
import com.covid.tracker.domain.shared.enums.PeriodFilter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = CaseController.ROOT_RESOURCE, produces = MediaType.APPLICATION_JSON_VALUE)
@Slf4j
public class CaseController {
    public static final String ROOT_RESOURCE = "/api/cases";

    private final CasesService casesService;

    public CaseController(CasesService casesService) {
        this.casesService = casesService;
    }

    @PostMapping
    public ResponseEntity<Integer> saveAllCase(@RequestBody List<CaseDto> caseDtoList) {
        log.info("Begin save All case");
        Integer countSaveCases = casesService.saveAllCases(caseDtoList);
        log.info("End save All case");
        return ResponseEntity.ok(countSaveCases);

    }

    @PutMapping
    public ResponseEntity<Integer> updateAllCase(@RequestBody List<CaseDto> caseDtoList) {
        log.info("Begin update All case");
        Integer countUpdateCases = casesService.updateAllCases(caseDtoList);
        log.info("End update All case");
        return ResponseEntity.ok(countUpdateCases);
    }

    @GetMapping
    public PaginationDto<CaseDto> searchSubscription(@RequestParam(required = false) Country country,
                                                     @RequestParam(required = false) PeriodFilter status,
                                                     @RequestParam(defaultValue = "0") Integer pageNumber,
                                                     @RequestParam(defaultValue = "10") Integer pageSize,
                                                     @RequestParam(defaultValue = "id") String sortBy) {
        Pageable paging = PageRequest.of(pageNumber, pageSize, Sort.by(sortBy));
        return null;


        //return subscriptionSheetService.searchSubscriptionSheetResult(productId, status, createdAt, userId,
            //    statusGroupService.getStatusByGroupStatus(statusGroup), organizationId, paging);
    }

}
