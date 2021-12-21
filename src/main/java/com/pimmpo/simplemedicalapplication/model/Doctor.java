package com.pimmpo.simplemedicalapplication.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "doctor")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long doctorId;

    private String name;

    private String surname;

    private LocalDate birthday;

    @ManyToOne
    @JoinColumn(name = "specialityId")
    private Speciality specialities;

    @ManyToOne
    @JoinColumn(name = "departmentId")
    private Department department;
}
