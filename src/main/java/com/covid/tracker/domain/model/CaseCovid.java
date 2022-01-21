package com.covid.tracker.domain.model;


import com.covid.tracker.domain.shared.enums.Country;
import com.covid.tracker.domain.shared.enums.ResultTest;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "T_CASE")
public class CaseCovid extends Patient implements Serializable {
    @Id
    @GeneratedValue(generator = "abc")
    @GenericGenerator(name = "abc", strategy = "increment")
    private Long id;
    @Column(name = "test_date")
    private LocalDateTime testDate;
    @Column(name = "result_test")
    @Enumerated(EnumType.STRING)
    private ResultTest resultTest;
}
