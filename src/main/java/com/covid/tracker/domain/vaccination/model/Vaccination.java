package com.covid.tracker.domain.vaccination.model;

import com.covid.tracker.domain.patient.model.PatientVaccination;
import com.covid.tracker.domain.shared.Auditable;
import com.covid.tracker.domain.shared.VaccinationType;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "T_VACCINATION")
public class Vaccination extends Auditable implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    @Column(name = "vaccination_type")
    @Enumerated(EnumType.STRING)
    private VaccinationType vaccinationType;
    @Column(name = "description")
    private String description;
    @OneToMany(mappedBy = "vaccination", cascade = CascadeType.REMOVE)
    private List<PatientVaccination> patientVaccinations = new ArrayList<>();

}
