package com.covid.tracker.domain.model;

import com.covid.tracker.domain.shared.enums.Auditable;
import com.covid.tracker.domain.shared.enums.ResultTest;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "T_TEST")
public class Test extends Auditable implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    @Column(name = "test_date")
    private LocalDateTime testDate;
    @Column(name = "result_test")
    @Enumerated(EnumType.STRING)
    private ResultTest resultTest;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "patient_id")
    private Patient patient;
}
