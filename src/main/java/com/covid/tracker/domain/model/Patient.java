package com.covid.tracker.domain.model;

import com.covid.tracker.domain.shared.Auditable;
import com.covid.tracker.dto.Country;
import com.covid.tracker.dto.ResultTest;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
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
    @Id
    @GeneratedValue(generator = "abc")
    @GenericGenerator(name = "abc", strategy = "increment")
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
    @Column(name = "test_date")
    private LocalDateTime testDate;
    @Column(name = "result_test")
    @Enumerated(EnumType.STRING)
    private ResultTest resultTest;
    @OneToMany(mappedBy = "patient", cascade = CascadeType.REMOVE)
    private List<Vaccination> patientVaccinations = new ArrayList<>();

}
