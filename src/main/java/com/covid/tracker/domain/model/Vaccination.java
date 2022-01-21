package com.covid.tracker.domain.model;

import com.covid.tracker.domain.shared.Auditable;
import com.covid.tracker.domain.shared.enums.VaccinationType;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "T_VACCINATION")
public class Vaccination extends Auditable implements Serializable {
    @Id
    @GeneratedValue(generator = "abc")
    @GenericGenerator(name = "abc", strategy = "increment")
    private Long id;
    @Column(name = "vaccination_date")
    private LocalDateTime vaccinationDate;
    @Column(name = "second_vaccination_date")
    private LocalDateTime secondVaccinationDate;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @Enumerated(EnumType.STRING)
    private VaccinationType vaccinationType;

}
