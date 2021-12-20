package com.pimmpo.simplemedicalapplication.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long patientId;

    private String name;

    private String surname;

    private LocalDate birthday;

    private long phoneNumber;
}
