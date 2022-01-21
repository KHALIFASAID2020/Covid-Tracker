package com.covid.tracker.domain.model;

import com.covid.tracker.domain.shared.Auditable;
import com.covid.tracker.domain.shared.enums.Country;
import lombok.*;


import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Patient extends Auditable {
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
}
