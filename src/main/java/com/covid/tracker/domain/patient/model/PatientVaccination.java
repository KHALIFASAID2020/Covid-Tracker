package com.covid.tracker.domain.patient.model;

import com.covid.tracker.domain.shared.Auditable;
import com.covid.tracker.domain.vaccination.model.Vaccination;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "T_PATIENT_VACCINATION")
public class PatientVaccination extends Auditable implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    @Column(name = "vaccination_date")
    private LocalDateTime vaccinationDate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "vaccination_id")
    private Vaccination vaccination;

}
