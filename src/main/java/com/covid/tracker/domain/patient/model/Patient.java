package com.covid.tracker.domain.patient.model;

import com.covid.tracker.domain.shared.Auditable;
import com.covid.tracker.domain.shared.Country;
import com.covid.tracker.domain.test.model.Test;
import com.covid.tracker.domain.vaccination.model.Vaccination;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "T_PATIENT")
public class Patient extends Auditable implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "birth_date")
    private LocalDate birthDate;
    @Column(name = "address")
    private String address;
    @Column(name = "cell_phone")
    private String cellPhone;
    @Column(name = "country")
    @Enumerated(EnumType.STRING)
    private Country country;
    @OneToMany(mappedBy = "patient", cascade = CascadeType.REMOVE)
    private List<PatientVaccination> patientVaccinations = new ArrayList<>();
    @OneToMany(mappedBy = "patient", cascade = CascadeType.REMOVE)
    private List<Test> tests = new ArrayList<>();

}
