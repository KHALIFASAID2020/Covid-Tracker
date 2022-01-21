package com.covid.tracker.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PaginationDto<T> {

    private Integer pageNumber;
    private Integer pageSize;
    private Long totalCount;
    private String sortBy;
    private List<T> data;

    PaginationDto(Integer pageSize, Integer pageNumber, String sortBy, Long totalCount, List<T> data) {
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
        this.sortBy = sortBy;
        this.data = data;
    }
}
