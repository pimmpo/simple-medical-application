package com.pimmpo.simplemedicalapplication.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "speciality")
public class Speciality {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long specialityId;

    private String name;
}
